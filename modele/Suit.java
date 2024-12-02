package modele;
public enum Suit{
    DIAMONDS(1, "♦"),
    HEARTS(2, "♥"),
    SPADES(3, "♠"),
    CLUBS(4, "♣");

    private final int value;
    private final String symbol;

    private Suit(int value,String symbol){
        this.value=value;
        this.symbol=symbol;
    } 

    public int getValue(){
        return this.value;
    }
    public String getSymbol(){
        return this.symbol;
    }

}