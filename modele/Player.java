package modele;

public class Player implements IPlayer {
    private String name;
    private Hand hand;

    public Player(String name){
        this.name= name;
        this.hand=new Hand();

    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void addCardToHand(PlayingCard pc){
        this.hand.addCard(pc);
    }

    @Override
    public PlayingCard removeCard(){
       return this.hand.removeCard();
    }

    @Override
    public PlayingCard getCard(int index){
        return this.hand.getCard(index);
    }
}
