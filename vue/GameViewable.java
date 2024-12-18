package vue;
import java.util.*;
import controleur.*;

public interface GameViewable{
    void setController(GameController gameController);
  
    void promptForPlayerName();
  
    void promptForNewGame();
  
    void promptForFlip();
  
    void showWinner(String playerName);
  
    void showPlayerName(int playerIndex,String playerName);
  
    void showFaceDownCardForPlayer(int i,String playerName);
  
    void showCardForPlayer(int i,String playerName,int rank,String suit);
}