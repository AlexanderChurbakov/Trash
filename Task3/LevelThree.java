package EasyCodeLectures.HomeWork.Lecture26Homeworks.Task3;

public class LevelThree extends Level{
    @Override
    protected void question() {
        System.out.println("You've choice SPEED.\nYour SPEED is up." +
                "\n You've RUN from the monsters\nBut monsters get more faster!" +
                " What you want to do?");
    }

    @Override
    protected boolean checkAnswer() {
        return false;
    }
}