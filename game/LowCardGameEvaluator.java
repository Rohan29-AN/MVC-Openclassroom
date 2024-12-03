package game;
import java.util.*;
import modele.*;
public class LowCardGameEvaluator implements GameEvaluator{
    @Override
    public Player evaluateWinner(List<Player> players){
        Player bestPlayer=null;
            int bestRank=13;
            int bestSuit=4;

            for(Player player:players){
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