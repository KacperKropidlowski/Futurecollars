package Task3;

public class UpgradedCalculator {

    private final double a;
    private final double b;

    public UpgradedCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double subtract() {
        return a - b;
    }

    public double multiply() {
        return a * b;
    }

    public double divide() {
        return a / b;
    }
}
