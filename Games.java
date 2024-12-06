import java.util.*;
import controleur.*;
import vue.*;
import modele.*;
import game.*;
import modele.DeckFactory.DeckType;

public class Games{
    public static void main(String args[]) {
		GameController gc = new GameController(new CommandLineView(),DeckFactory.makeDeck(DeckType.NORMAL),new HighCardGameEvaluator());
		gc.run();
		System.out.println("Nothing special, I'm tired");
		System.out.println("But I don't want to give up");
		System.out.println("The purpose of these sout is to maintain my coding streak every day");
	}
}