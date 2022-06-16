package Task2;

public class Circle extends Shape {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return r * r * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }
}
