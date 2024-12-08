package vue;

import java.util.*;
import controleur.*;

public class GameViewables implements GameViewable {
    List<GameViewable> views;

    public GameViewables() {
        this.views = new ArrayList<GameViewable>();
    }

    public void addView(GameViewable view) {
        this.views.add(view);
    }

    void setController(GameController gameController) {
        for (GameViewable view : this.view) {
            this.view.setController(gameController);
        }
    }

    void promptForPlayerName() {
        for (GameViewable view : this.view) {
            this.view.promptForPlayerName();
        }
    }

    void promptForNewGame() {
        for (GameViewable view : this.view) {
            this.view.promptForNewGame();
        }
    }

    void promptForFlip() {
        for (GameViewable view : this.view) {
            this.view.promptForFlip();
        }
    }

    void showWinner(String playerName) {
        for (GameViewable view : this.view) {
            this.view.showWinner(playerName);
        }
    }

    void showPlayerName(int playerIndex, String playerName) {
        for (GameViewable view : this.view) {
            this.view.showPlayerName(playerIndex, playerName);
        }
    }

    void showFaceDownCardForPlayer(int i, String playerName) {
        for (GameViewable view : this.view) {
            this.view.showFaceDownCardForPlayer(i, playerName);
        }
    }

    void showCardForPlayer(int i, String playerName, int rank, String suit) {
        for (GameViewable view : this.view) {
            this.view.showCardForPlayer(i, playerName, rank, suit);
        }
    }

}