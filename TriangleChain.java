package EasyCodeLectures.HomeWork.Lecture26task1final;

public class TriangleChain implements TriangleHandler {
    private final TriangleHandler firstTriangle;
    private final TriangleHandler secondTriangle;

    public TriangleChain(Triangle firstTriangle,
                         TriangleHandler secondTriangle) {
        this.firstTriangle = firstTriangle;
        this.secondTriangle = secondTriangle;
    }

    public void square() {
        firstTriangle.square();
        secondTriangle.square();

    }
}