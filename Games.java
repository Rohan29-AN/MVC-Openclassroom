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
	}
}