package Task3;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

public class UpgradedCalculator {
    private Map<String, CalculatorOperation> operations;

    public UpgradedCalculator(Map<String, CalculatorOperation> operations) {
        this.operations = operations;
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Division division = new Division();
        Multiplication multiplication = new Multiplication();
        Map<String, CalculatorOperation> operations = new HashMap<>();
        operations.put(addition.getSign(), addition);
        operations.put(subtraction.getSign(), subtraction);
        operations.put(division.getSign(), division);
        operations.put(multiplication.getSign(), multiplication);
    }

    public double upgradedCalculate(String calculatorOperation, double left, double right) {
        if (operations.get(calculatorOperation) == null) {
            throw new UnsupportedOperationException("There is no such operation:" + calculatorOperation);
        }
        if (calculatorOperation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        return operations.get(calculatorOperation).calculate(left, right);
    }
}