package lecture29HomeWork.task3.Levels;

import lecture29HomeWork.task3.GameHandler;
import lecture29HomeWork.task3.PlayerChoice;

public abstract class Game implements GameHandler {
    private final PlayerChoice player;

    protected Game(PlayerChoice player) {
        this.player = player;
    }

    @Override
    public int answer() {
        int result = player.makeChoice();
        return result;
    }
}