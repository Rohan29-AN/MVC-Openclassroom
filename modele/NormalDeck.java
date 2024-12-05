package modele;

public class NormalDeck extends Deck{


     public NormalDeck(){
        for(Rank rank: Rank.values()){
            for(Suit suit: Suit.values()){
                //System.out.println("Creating card ["+rank+"] ["+suit+"]");
                cards.add(new PlayingCard(rank,suit));
            }
        }
        shuffle();
    }

}