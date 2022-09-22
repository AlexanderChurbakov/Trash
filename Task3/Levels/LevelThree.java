package lecture29HomeWork.task3.Levels;

import lecture29HomeWork.task3.PlayerChoice;

public class LevelThree extends Game {

    public LevelThree(PlayerChoice player) {
        super(player);

    }

    @Override
    public void question() {
        System.out.println("You choose 3. It's make your luck up");
    }

}
