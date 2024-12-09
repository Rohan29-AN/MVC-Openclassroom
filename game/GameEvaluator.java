package game;

import java.util.*;
import modele.*;

public interface GameEvaluator{
    IPlayer evaluateWinner(List<IPlayer> players);
}