package EasyCodeLectures.HomeWork.Lecture26Homeworks.Task3;

public abstract class Level {
    protected abstract void question();
    protected abstract boolean checkAnswer();
    enum Answers {
        DEMO,
        UP_STRENGTH,
        UP_SPEED,
        DEATH
    }
}