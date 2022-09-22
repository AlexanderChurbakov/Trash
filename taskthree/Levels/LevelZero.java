package lecture29HomeWork.task3.Levels;

import lecture29HomeWork.task3.PlayerChoice;

public class LevelZero extends Game {

    public LevelZero(PlayerChoice player) {
        super(player);
    }

    @Override
    public  void question() {
        System.out.print("push 1 to 3");
    }

}