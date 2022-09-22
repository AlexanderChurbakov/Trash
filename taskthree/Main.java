package lecture29HomeWork.task3;

import lecture29HomeWork.task3.Levels.LevelOne;
import lecture29HomeWork.task3.Levels.LevelThree;
import lecture29HomeWork.task3.Levels.LevelZero;
import lecture29HomeWork.task3.Levels.LeverTwo;

public class Main {
    public static void main(String[] args) {

        PlayerChoice player = new PlayerChoice();

        GameChain chain = new GameChain(
                new LevelZero(player),
                new LevelOne(player),
                new LeverTwo(player),
                new LevelThree(player)
        );

        chain.answer();
    }
}