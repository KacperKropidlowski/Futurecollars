package Task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static Task4.TextLengthGetter.getTextLength;

class TextLengthGetterTest {
    @ParameterizedTest
    @MethodSource("provideStringsForGetTextLength")
    void shouldGetTextLength (String input, int expected){
        int actualValue = getTextLength(input);
        Assertions.assertEquals(expected,actualValue);
    }
    private static Stream<Arguments> provideStringsForGetTextLength(){
        return Stream.of(
                Arguments.of("Kaszanka", 8),
                Arguments.of("Lorem ipsum dolor sit amet.", 27),
                Arguments.of("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque elementum.",80)
        );
    }

}