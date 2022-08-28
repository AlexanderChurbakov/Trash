package EasyCodeLectures.HomeWork.Lecture26Homeworks.Task2;

public abstract class Validator implements ValidatorHandler {
    private final String password;

    protected Validator(String password) {
        this.password = password;
    }

    public String password() {
        return password;
    }

}