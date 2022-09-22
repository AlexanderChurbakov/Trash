package lecture29HomeWork.task3.Levels;

import lecture29HomeWork.task3.PlayerChoice;

public class LeverTwo extends Game {

    public LeverTwo(PlayerChoice player) {
        super(player);
    }

    @Override
    public void question() {
        System.out.println("You choose 2. It's make your speed up");
    }

}