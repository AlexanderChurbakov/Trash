package EasyCodeLectures.HomeWork.Lecture26Homeworks.Task2;

public class ValidatorChain implements ValidatorHandler {

    private final ValidatorHandler first;
    private final ValidatorHandler second;

    public ValidatorChain(ValidatorHandler first,
                          ValidatorHandler second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean validate() {
        if (first.validate()) {
            second.validate();
        }
        return true;
    }
}