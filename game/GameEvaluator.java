package game;
import java.util.*;
import controleur.*;
import modele.*;

interface GameEvaluator{
    Player evaluateWinner(List<Player> players);
}