package vue;
import java.util.*;
import controleur.*; 


public class GameViewables implements GameViewable{
    List<GameViewable>  views;


    public GameViewables(){
        this.views=new ArrayList<GameViewable>();
    }

    public void addView(GameViewable view){
        this.views.add(view);
    }

    public void setController(GameController gameController){
        for(GameViewable view: this.views){
            view.setController(gameController);
        }
     }
  
    public void promptForPlayerName(){
         for(GameViewable view: this.views){
            view.promptForPlayerName();
        }
    }
  
    public void promptForNewGame(){
         for(GameViewable view: this.views){
            view.promptForNewGame();
        }
    }
  
    public void promptForFlip(){
         for(GameViewable view: this.views){
            view.promptForFlip();
        }
    }
  
    public void showWinner(String playerName){
          for(GameViewable view: this.views){
            view.showWinner(playerName);
        }
    }
  
    public void showPlayerName(int playerIndex,String playerName){
           for(GameViewable view: this.views){
            view.showPlayerName(playerIndex,playerName);
        }
    }
  
    public void showFaceDownCardForPlayer(int i,String playerName){
         for(GameViewable view: this.views){
            view.showFaceDownCardForPlayer(i,playerName);
        }
    }
  
    public void showCardForPlayer(int i,String playerName,int rank,String suit){
         for(GameViewable view: this.views){
            view.showCardForPlayer(i,playerName,rank,suit);
        }
    }

}