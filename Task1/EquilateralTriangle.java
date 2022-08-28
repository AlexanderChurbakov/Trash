package EasyCodeLectures.HomeWork.Lecture26task1final;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double a) {
        super(a, a, a);
    }

    @Override
    public void square() {

        System.out.println(triangleSide(0) *
                triangleSide(0) *
                Math.sqrt(3) / 4
        );
    }

    @Override
    public TriangleType triangleType() {
        return TriangleType.EQUILATERAL;
    }
}
