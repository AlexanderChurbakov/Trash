package EasyCodeLectures.HomeWork.Lecture26Homeworks.Task2;

public class ValidateNumber extends Validator {

    protected ValidateNumber(String password) {
        super(password);
    }

    @Override
    public boolean validate() {
        String[] passwordToArray = password().split("");
        int arrayLength = passwordToArray.length;
        boolean result = true;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < 10; j++) {
                String jToString = String.valueOf(j);
                if (passwordToArray[i].equals(jToString)) {
                    result = false;
                    throw new IllegalArgumentException("Wrong argument. It's have a number. " + password());
                }
            }
        }
        return result;
    }
}