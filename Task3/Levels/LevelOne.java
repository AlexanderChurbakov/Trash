package lecture29HomeWork.task3.Levels;

import lecture29HomeWork.task3.PlayerChoice;

public class LevelOne extends Game {

    public LevelOne(PlayerChoice player) {
        super(player);
    }

    @Override
   public void question() {
        System.out.println("you choose 1. It's make you more power");
    }


}
