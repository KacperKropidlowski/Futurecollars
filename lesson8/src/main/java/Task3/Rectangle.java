package Task3;

public class Rectangle implements AreaAndPerimeterCalculator {
    private final double edgeR;
    private final double edgeT;

    public Rectangle(double edgeR, double edgeT) {
        this.edgeR = edgeR;
        this.edgeT = edgeT;
    }

    @Override
    public double getArea() {
        return edgeR * edgeT;
    }

    @Override
    public double getPerimeter() {
        return 2 * (edgeR + edgeT);
    }
}
