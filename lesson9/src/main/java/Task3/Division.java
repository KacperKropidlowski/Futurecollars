package Task3;

public class Division implements CalculatorOperation {
    private double result;

    @Override
    public double calculate(double right, double left) {
        if (right != 0) {
            result = right / left;
        } return result;
    }
}
