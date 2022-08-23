package EasyCodeLectures.HomeWork.Lecture26task1final;

public abstract class Triangle implements TriangleHandler {
    private final double[] sides;
    private final TriangleType triangleType;

    protected Triangle(double... sides) {
        this.sides = sides;
        this.triangleType = triangleType();
    }

    @Override
    public void square() {
        double halfPerimeter = halfPerimeter();

        System.out.println(Math.sqrt(
                halfPerimeter *
                        (halfPerimeter - sides[0]) *
                        (halfPerimeter - sides[1]) *
                        (halfPerimeter - sides[2])
        ));
    }

    public double triangleSide(int sideNumber) {
        return sides[sideNumber];
    }

    public double halfPerimeter() {
        double result = 0;
        for (double item : sides) {
            result += item;
        }
        return result / 2;
    }

    protected abstract TriangleType triangleType();
}