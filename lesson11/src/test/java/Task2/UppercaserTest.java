package Task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

class UppercaserTest {
    @ParameterizedTest
    @ValueSource(strings = {"Makrela", "Rabarbar", "koszatniczka", "BamBaRyła"})
    void shouldSetUppercase(String input) {
        Assertions.assertEquals(input.toUpperCase(), Uppercaser.setUppercase(input));
    }

    @ParameterizedTest
    @NullSource
    void shouldReturnNull(String input) {
        Assertions.assertEquals("null", Uppercaser.setUppercase(input));
    }

    @ParameterizedTest
    @EmptySource
    void shouldReturnEmpty(String input) {
        Assertions.assertEquals("", Uppercaser.setUppercase(input));
    }
}