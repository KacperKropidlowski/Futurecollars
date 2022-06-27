package Task3;

public class Triangle implements GeometricFigure {

    private final double edgeA;
    private final double edgeB;
    private final double edgeC;
    private final double height;

    public Triangle(double edgeA, double edgeB, double edgeC, double height) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
        this.height = height;
    }

    @Override
    public double getArea() {
        return edgeA * (height / 2);

    }

    @Override
    public double getPerimeter() {
        return edgeA + edgeB + edgeC;
    }
}
