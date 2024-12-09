package modele;
public interface IPlayer {

    String getName();
    void addCardToHand(PlayingCard pc);
    PlayingCard removeCard();    
    PlayingCard  getCard(int index);

} 