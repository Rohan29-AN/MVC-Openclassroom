package modele;
public class IPlayer{
    private String name;
    private Hand hand;

    public IPlayer(String name){
        this.name= name;
        this.hand=new Hand();

    }

    public String getName(){
        return this.name;
    }

    public void addCardToHand(PlayingCard pc){
        this.hand.addCard(pc);
    }

    public PlayingCard removeCard(){
       return this.hand.removeCard();
    }

    public PlayingCard getCard(int index){
        return this.hand.getCard(index);
    }

}