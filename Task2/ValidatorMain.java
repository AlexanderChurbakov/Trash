package EasyCodeLectures.HomeWork.Lecture26Homeworks.Task2;

public class ValidatorMain {
    public static void main(String[] args) {
        String password = "";
        ValidatorChain chain = new ValidatorChain(
                new ValidateNumber(password),
                new ValidateMinValue(password, 1)
        );
        chain.validate();
    }
}