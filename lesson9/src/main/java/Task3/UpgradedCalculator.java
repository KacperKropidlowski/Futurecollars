package Task3;

import java.security.InvalidParameterException;
import java.util.List;

public class UpgradedCalculator {
    private final List<CalculatorOperation> operations;

    public UpgradedCalculator(List<CalculatorOperation> operations) {
        this.operations = operations;
    }

    public double calculate(String operationSign, double left, double right) {
        if (operationSign == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }

        return operations.stream()
                .filter(operation -> operationSign.equals(operation.getSign()))
                .findAny()
                .orElseThrow(() -> new UnsupportedOperationException("There is no such operation:" + operationSign))
                .calculate(left, right);
    }
}