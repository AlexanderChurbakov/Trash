package lecture29HomeWork.task3;


public class GameChain implements GameHandler {
    private final GameHandler first;
    private final GameHandler second;
    private final GameHandler third;
    private final GameHandler fourth;

    public GameChain(GameHandler first,
                     GameHandler second,
                     GameHandler third,
                     GameHandler fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    // TODO: 22.09.2022 исправить иф елсы, как это сделать - хз.
    // Добавить цикл чтобы проверяло число от 1 до 3 и если не то то заного ввод

    @Override
    public int answer() {
        first.question();
        int answer;
        answer = first.answer();
        if (answer == 1) {
            second.question();
        } else if (answer == 2) {
            third.question();
        } else if (answer == 3) {
            fourth.question();
        }
        return 0;
    }

    // TODO: 22.09.2022 пустой метод
    @Override
    public void question() {

    }
}