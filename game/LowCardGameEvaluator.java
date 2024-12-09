package game;
import java.util.*;
import modele.*;
public class LowCardGameEvaluator implements GameEvaluator{
    @Override
    public IPlayer evaluateWinner(List<IPlayer> players){
        IPlayer bestPlayer=null;
            int bestRank=13;
            int bestSuit=4;

            for(IPlayer player:players){
                boolean newBestPlayer= false;
                if(bestPlayer==null){
                    newBestPlayer=true;
                }
                else{
                    PlayingCard pc=player.getCard(0);
                    int thisRank= pc.getRank().getValue();
                    if(thisRank<=bestRank){
                        if(thisRank < bestRank){
                            newBestPlayer=true;
                        }
                        else{
                            if(pc.getSuit().getValue() > bestSuit){
                                newBestPlayer=true;
                            }
                        }
                    }
                }
                if(newBestPlayer){
                    bestPlayer=player;
                    PlayingCard pc= bestPlayer.getCard(0);
                    bestRank=pc.getRank().getValue();
                    bestSuit=pc.getSuit().getValue();
                }
            }
            return bestPlayer;
          
 }
}