package EasyCodeLectures.HomeWork.Lecture26Homeworks.Task3;

public class LevelChain {
    private final Level first;
    private final Level second;
    private final Level third;
    private final PlayerChoice playerChoice;

    public LevelChain(Level first,
                      Level second,
                      Level third,
                      PlayerChoice playerChoice) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.playerChoice = playerChoice;
    }

    public void startGame() {
        first.question();
        Level.Answers player = playerChoice.choice();
        if (player == Level.Answers.UP_STRENGTH) {
            second.question();
        } else if (player == Level.Answers.UP_SPEED) {
            third.question();
        } else {
            System.out.println("You dead");
        }
    }

}