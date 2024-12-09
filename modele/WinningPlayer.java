package modele;

public class WinningPlayer implements IPlayer {
    IPlayer player;

    public WinningPlayer(IPlayer player) {
        this.player = player;
    }

    @Override
    public String getName() {
       return  "******"+this.player.getName()+"******";
    }

    @Override
    public void addCardToHand(PlayingCard pc) {
        this.player.addCardToHand(pc);        
    }

    @Override
    public PlayingCard removeCard() {
      return this.player.removeCard();
    }

    @Override
    public PlayingCard getCard(int index) {
       return this.player.getCard(index);
    }

}
