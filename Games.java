import java.util.*;
import controleur.*;
import vue.*;
import modele.*;

public class Games{
    public static void main(String args[]) {
		GameController gc = new GameController(new View(),new Deck());
		gc.run();
	}
}