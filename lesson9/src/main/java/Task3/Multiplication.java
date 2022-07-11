package Task3;

public class Multiplication implements CalculatorOperation {

    @Override
    public double calculate(double left, double right) {
        return left * right;
    }

    @Override
    public String getSign() {
        return "*";
    }
}

