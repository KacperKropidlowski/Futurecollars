package Task3;

import java.security.InvalidParameterException;

public class UpgradedCalculator {
    public double upgradedCalculate(CalculatorOperation calculatorOperation, double left, double right)

    {
        if (calculatorOperation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        return calculatorOperation.calculate(left,right);
    }
}