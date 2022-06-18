package Task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpgradedCalculatorTest {

    @Test
    void shouldAddTwoNumbers() {
        //given
        UpgradedCalculator upgradedCalculator = new UpgradedCalculator(17, 8);
        //when
        double result = upgradedCalculator.add();
        //then
        Assertions.assertEquals(25, result);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        //given
        UpgradedCalculator upgradedCalculator = new UpgradedCalculator(17, 8);
        //when
        double result = upgradedCalculator.subtract();
        //then
        Assertions.assertEquals(9, result);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        //given
        UpgradedCalculator upgradedCalculator = new UpgradedCalculator(17, 8);
        //when
        double result = upgradedCalculator.multiply();
        //then
        Assertions.assertEquals(136, result);
    }

    @Test
    void shouldDivideTwoNumbers() {
        //given
        UpgradedCalculator upgradedCalculator = new UpgradedCalculator(17, 8);
        //when
        double result = upgradedCalculator.divide();
        //then
        Assertions.assertEquals(2.125, result);
    }
}