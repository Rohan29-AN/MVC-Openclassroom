package modele;

public class DeckFactory{
    public enum DeckType{
        NORMAL,
        SMALL,
        TEST
    }

    public static Deck makeDeck(DeckType type){
        switch(type){
            case NORMAL:
                return new NormalDeck();
            case SMALL:{
                return new SmallDeck();
            }
        }
    }
}