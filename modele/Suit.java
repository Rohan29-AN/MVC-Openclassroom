public enum Suit{
    DIAMONDS(1),
    HEARTS(2),
    SPLADES(3),
    CLUBS(4);

    private final int value;

    public Suit(int value){
        this.value=value;
    } 

    public int getValue(){
        return this.value;
    }
}