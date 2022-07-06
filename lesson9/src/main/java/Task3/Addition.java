package Task3;

public class Addition implements CalculatorOperation {

    @Override
    public double calculate(double left, double right) {
        return left + right;
    }
}
