package game;

import java.util.*;
import modele.*;

public interface GameEvaluator{
    Player evaluateWinner(List<Player> players);
}