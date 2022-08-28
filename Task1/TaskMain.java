package EasyCodeLectures.HomeWork.Lecture26task1final;

public class TaskMain {
    public static void main(String[] args) {
        TriangleChain chain1 = new TriangleChain(
                new IsoscelesTriangle(2, 4),
                new TriangleChain (
                        new EquilateralTriangle(2),
                        new RandomRectangle(2,2,3)
                )
        );
        chain1.square();

    }
}
