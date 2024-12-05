package modele;
import java.util.*;
public abstract class Deck{
    protected List<PlayingCard> cards=new ArrayList<PlayingCard>();
    

    public void shuffle(){
        Random rand=new Random();
        int cardsSize= this.cards.size();
        for(int i=0;i<cardsSize; i++){
            int randInt=rand.nextInt(cardsSize);
            Collections.swap(this.cards,i,randInt);
        }
    }

    public PlayingCard removeTopCard(){
        return cards.remove(0);
    }

    public void returnCardToDeck(PlayingCard pc){
        this.cards.add(pc);
    }   

    public List<PlayingCard> getCards(){
        return this.cards;
    }
}