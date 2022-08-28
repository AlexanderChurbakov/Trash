package EasyCodeLectures.HomeWork.Lecture26Homeworks.Task2;

public class ValidateMinValue extends NullValidate {
    private final int minValue;

    protected ValidateMinValue(String password,
                               int minValue) {
        super(password);
        this.minValue = minValue;
    }

    @Override
    public boolean validate() {
        boolean result = true;
        if (password().length() < minValue) {
            result = false;
            throw new IllegalArgumentException("Wrong value. It's too short. " + password());
        } else {
            System.out.println("your password is passed");
        }
        return result;
    }
}