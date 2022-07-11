package Task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

class UpgradedCalculatorTest {

    @ParameterizedTest
    @MethodSource("provideValuesForShouldPerformUpgradedCalculationTest")
    void shouldPerformUpgradedCalculation(String calculatorOperation, double left, double right, double expected) {
        //given
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Division division = new Division();
        Multiplication multiplication = new Multiplication();
        Map<String, CalculatorOperation> operations = new HashMap<>();
        operations.put(addition.getSign(), addition);
        operations.put(subtraction.getSign(), subtraction);
        operations.put(division.getSign(), division);
        operations.put(multiplication.getSign(), multiplication);
        UpgradedCalculator upgradedCalculator = new UpgradedCalculator(operations);
        //when
        double actual = upgradedCalculator.upgradedCalculate(calculatorOperation, left, right);
        //then
        Assertions.assertEquals(expected, actual);
    }

    private static Stream<Arguments> provideValuesForShouldPerformUpgradedCalculationTest() {
        return Stream.of(
                Arguments.of("+", 5, 5, 10),
                Arguments.of("-", 10, 5, 5),
                Arguments.of("*", 5, 5, 25),
                Arguments.of("/", 25, 5, 5)
        );
    }
}