package EasyCodeLectures.HomeWork.Lecture26Homeworks.Task2;

public abstract class NullValidate extends Validator {
    protected NullValidate(String password) {
        super(password);
        if (password.length() == 0) {
            throw new IllegalArgumentException("Wrong argument. It's empty. " + password());
        }
    }
}