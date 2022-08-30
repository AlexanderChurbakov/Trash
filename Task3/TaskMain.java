package EasyCodeLectures.HomeWork.Lecture26Homeworks.Task3;

public class TaskMain {
    public static void main(String[] args) {
        PlayerChoice playerChoice = new PlayerChoice();
        Level level1 = new LevelOne();
        Level level2 = new LevelTwo();
        Level level3 = new LevelThree();
        LevelChain chain = new LevelChain(level1, level2, level3,
                playerChoice);
        chain.startGame();
    }
}