package EasyCodeLectures.HomeWork.Lecture26task1final;

public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(double a,
                             double b) {
        super(a, a, b);
    }

    @Override
    public void square() {
        System.out.println(IsoscelesTriangleHeight() *
                triangleSide(2));
    }

    @Override
    public TriangleType triangleType() {
        return TriangleType.ISOSCELES;
    }

    public double IsoscelesTriangleHeight() {
        return triangleSide(1) *
                triangleSide(2) *
                0.5;
    }
}
