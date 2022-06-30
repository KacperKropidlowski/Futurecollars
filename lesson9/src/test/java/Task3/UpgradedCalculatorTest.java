package Task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class UpgradedCalculatorTest {

    @ParameterizedTest
    @MethodSource("provideValuesForShouldPerformUpgradedCalculationTest")
    void shouldPerformUpgradedCalculation(CalculatorOperation calculatorOperation,double left, double right, double expected) {
        //given
        UpgradedCalculator upgradedCalculator = new UpgradedCalculator();
        //when
        double actual = upgradedCalculator.upgradedCalculate(calculatorOperation,left,right);
        //then
        Assertions.assertEquals(expected,actual);
    }
    private static Stream<Arguments> provideValuesForShouldPerformUpgradedCalculationTest(){
        return Stream.of(
                Arguments.of(new Addition(),5,5,10),
                Arguments.of(new Subtraction(),10,5,5),
                Arguments.of(new Multiplication(),5,5,25),
                Arguments.of(new Division(),25,5,5)
        );
    }
}