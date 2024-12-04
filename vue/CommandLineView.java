package vue;
import java.util.*;
import controleur.*;

public class CommandLineView implements GameViewable {
    private GameController controller;
    Scanner keyboard;

    public CommandLineView(){
        this.keyboard=new Scanner(System.in);
    }

    @Override
    public void setController(GameController controller){
        this.controller=controller;
    }

    @Override
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

    @Override
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

    @Override
    public void promptForFlip(){
        System.out.println("Press enter to reveal card");
        this.keyboard.nextLine();
        this.controller.flipCards();
    }

    @Override
    public void showWinner(String playerName){
        System.out.println("Winner is "+playerName);
    }

    @Override
    public void showPlayerName(int playerIndex,String playerName){
        System.out.println("["+playerIndex+"]["+playerName+"]");
    }

    @Override
    public void showFaceDownCardForPlayer(int i, String playerName){
        System.out.println("["+i+"]["+playerName+"][*][*]");
    }

    @Override
    public void showCardForPlayer(int i, String playerName,int rank,String suit){
          System.out.println("["+i+"]["+playerName+"]["+rank+"]["+suit+"]");
    }
}