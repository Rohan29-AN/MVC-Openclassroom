import java.util.*;
import controleur.*;
import vue.*;
import modele.*;
import game.*;

public class Games{
    public static void main(String args[]) {
		GameController gc = new GameController(new View(),new Deck(),new HighCardGameEvaluator());
		gc.run();
	}
}