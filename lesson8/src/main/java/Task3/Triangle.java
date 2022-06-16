package Task3;

public class Triangle implements AreaAndPerimeterCalculator {

    private final double edgeA;
    private final double edgeB;
    private final double edgeC;
    private final double h;

    public Triangle(double edgeA, double edgeB, double edgeC, double h) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
        this.h = h;
    }

    @Override
    public double getArea() {
        return edgeA * (h / 2);

    }

    @Override
    public double getPerimeter() {
        return edgeA + edgeB + edgeC;
    }
}
