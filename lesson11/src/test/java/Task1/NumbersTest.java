package Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class NumbersTest {

    @ParameterizedTest
    @ValueSource(ints = {2,158,3366,74101478,9999998,14})
    void shouldCheckIsNumberDivisibleBy2(int input) {
        Assertions.assertTrue(Numbers.isDivisibleBy2(input));
    }
    @ParameterizedTest
    @ValueSource(ints = {3,159,3367,74101473,9999999,15})
    void shouldCheckIsNumberIndivisibleBy2(int input) {
        Assertions.assertFalse(Numbers.isDivisibleBy2(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"364:13","111:3","500:5","666:18"}, delimiter = ':')
    void shouldSumDigitsOfNumber(String input, String expected){
        String actualValue = String.valueOf(Numbers.sumDigitsOfNumber(input));
        Assertions.assertEquals(expected, actualValue);
    }

}