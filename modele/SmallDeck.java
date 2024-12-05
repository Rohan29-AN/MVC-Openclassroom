package modele;

public class SmallDeck extends Deck{

     public SmallDeck(){
        for(Rank rank: Rank.values()){
            for(Suit suit: Suit.values()){

                if(rank.getValue() > 7){
                    //System.out.println("Creating card ["+rank+"] ["+suit+"]");
                    cards.add(new PlayingCard(rank,suit));
       
                }
            }
        }
        shuffle();
    }
}