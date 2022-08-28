package EasyCodeLectures.HomeWork.Lecture26task1final;

public class RandomRectangle extends Triangle {
    public RandomRectangle(double a,
                           double b,
                           double c) {
        super(a, b, c);
    }

    @Override
    protected TriangleType triangleType() {
        return TriangleType.RANDOM;
    }
}
