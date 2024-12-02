package vue;
import java.util.*;
import controleur.*;

public class View{
    private GameController controller;
    Scanner keyboard;

    public View(){
        this.keyboard=new Scanner(System.in);
    }

    public void setController(GameController controller){
        this.controller=controller;
    }

    public void promptForPlayerName(){
         System.out.println("Enter Player name:");
         String name=this.keyboard.nextLine();
         if(name.equals("")){
            controller.startGame();
         }
         else{
            controller.addPlayer(name);
         }
    }

    public void promptForNewGame(){
        System.out.println("Press D to deal again or Q to exit");
        String input =this.keyboard.nextLine();
        if(input.equals("D")){
            this.controller.startGame();
        }
        else{
            System.exit(0);
        }
        
    }

    public void promptForFlip(){
        System.out.println("Press enter to reveal card");
        this.keyboard.nextLine();
        this.controller.flipCards();
    }

    public void showWinner(String playerName){
        System.out.println("Winner is "+playerName);
    }

    public void showPlayerName(int playerIndex,String playerName){
        System.out.println("["+playerIndex+"]["+playerName+"]");
    }

    public void showFaceDownCardForPlayer(int i, String playerName){
        System.out.println("["+i+"]["+playerName+"][*][*]");
    }

    public void showCardForPlayer(int i, String playerName,int rank,String suit){
          System.out.println("["+i+"]["+playerName+"]["+rank+"]["+suit+"]");
    }
}