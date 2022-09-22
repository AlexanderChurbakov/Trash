package EasyCodeLectures.HomeWork.Lecture26Homeworks.Task3;

import java.util.Scanner;

public class PlayerChoice {

    public int enterChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public Level.Answers choice() {
        Level.Answers result = Level.Answers.DEMO;
        switch (enterChoice()) {
            case 1:
                result = Level.Answers.UP_STRENGTH;
                break;
            case 2:
                result = Level.Answers.UP_SPEED;
                break;
            case 3:
                result = Level.Answers.DEATH;
                break;
        }
        return result;
    }
}