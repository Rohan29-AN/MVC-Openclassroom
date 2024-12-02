package controleur;
import java.util.*;
import vue.*;
import modele.*;
import modele.PlayingCard;
import vue.View;

public class GameController{
    enum GameState{
        ADDING_PLAYERS,
        CARDS_DEALT,
        WINNER_REVEALED;
    }

    private Deck deck;
    private List<Player> players;
    private Player playerWinner;
    View view;
    GameState gameState;

    public GameController(View view,Deck deck){
        this.view=view;
        this.deck=deck;
        this.players=new ArrayList<Player>();
        this.gameState=GameState.ADDING_PLAYERS;
        this.view.setController(this);
    }

    public void addPlayer(String playerName){
        if(this.gameState == GameState.ADDING_PLAYERS){
            this.players.add(new Player(playerName));
            this.view.showPlayerName(players.size(),playerName);
        }
    }

    public void run(){
        while(this.gameState == GameState.ADDING_PLAYERS){
            this.view.promptForPlayerName();
        }

        switch(this.gameState){
            case CARDS_DEALT:
                this.view.promptForFlip();
                break;

            case WINNER_REVEALED:
                this.view.promptForNewGame();
                break;  
        }
    }

    public void startGame(){
        if(this.gameState!=GameState.CARDS_DEALT){
            this.deck.shuffle();
            int playerIndex=1;
            for(Player player: this.players){
                player.addCardToHand(this.deck.removeTopCard());
                this.view.showFaceDownCardForPlayer(playerIndex++,player.getName());
            }
            this.gameState=GameState.CARDS_DEALT;
        }
        this.run();
    } 

    public void flipCards(){
        int playerIndex=1;
        for(Player player:this.players){
            PlayingCard pc = player.getCard(0);
            pc.flip();
            this.view.showCardForPlayer(playerIndex++,player.getName(),pc.getRank().getValue(),pc.getSuit().getSymbol());
        }
        this.evaluateWinner();
        this.displayWinner();
        this.rebuildDeck();
        this.gameState=GameState.WINNER_REVEALED;
        this.run();
    }

    public void evaluateWinner(){
        Player bestPlayer=null;
        int bestRank=-1;
        int bestSuit=-1;

        for(Player player:this.players){
            boolean newBestPlayer= false;
            if(bestPlayer==null){
                newBestPlayer=true;
            }
            else{
                PlayingCard pc=player.getCard(0);
                int thisRank= pc.getRank().getValue();
                if(thisRank>=bestRank){
                    if(thisRank> bestRank){
                        newBestPlayer=true;
                    }
                    else{
                        if(pc.getSuit().getValue() > bestSuit){
                            newBestPlayer=true;
                        }
                    }
                }
            }
            if(newBestPlayer){
                bestPlayer=player;
                PlayingCard pc= bestPlayer.getCard(0);
                bestRank=pc.getRank().getValue();
                bestSuit=pc.getSuit().getValue();
            }
        }
        this.playerWinner=bestPlayer;
    }

    void displayWinner(){
        this.view.showWinner(this.playerWinner.getName());
    }

    void rebuildDeck(){
        for(Player player:this.players){
            this.deck.returnCardToDeck(player.removeCard());
        }
    }
}