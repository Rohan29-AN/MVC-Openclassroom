package modele;
public class PlayingCard{
    private Rank rank;
    private Suit suit;
    private boolean faceUp;

    public PlayingCard(Rank rank,Suit suit){
        this.rank=rank;
        this.suit=suit;
    }

    public Rank getRank(){
        return this.rank;
    }

    public Suit getSuit(){
        return this.suit;
    }

    public boolean isFaceUp(){
        return this.faceUp;
    }

    public void flip(){
        this.faceUp=!this.faceUp;
    }
}