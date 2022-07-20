package Task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class UpgradedCalculatorTest {

    @ParameterizedTest
    @MethodSource("provideValuesForShouldPerformUpgradedCalculationTest")
    void shouldPerformUpgradedCalculation(String calculatorOperation, double left, double right, double expected) {
        //given
        UpgradedCalculator upgradedCalculator = new UpgradedCalculator(
                List.of(new Addition(), new Subtraction(), new Division(), new Multiplication())
        );
        //when
        double actual = upgradedCalculator.calculate(calculatorOperation, left, right);
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