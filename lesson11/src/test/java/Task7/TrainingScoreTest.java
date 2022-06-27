package Task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TrainingScoreTest {
    @ParameterizedTest
    @MethodSource("provideDoublesForGetTrainingScore")
    void shouldGetTrainingScore(double minutes, double calories, double pulse, String expected) {
        String result = TrainingScore.getTrainingScore(minutes, calories, pulse);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> provideDoublesForGetTrainingScore() {
        return Stream.of(
                Arguments.of(29, 299, 176, "Low training efficiency\n" + "Your training score: 1.0"),
                Arguments.of(61, 401, 159, "Perfect training efficiency\n" + "Your training score: 3.0"),
                Arguments.of(60, 400, 160, "Very good training efficiency\n" + "Your training score: 2.5"),
                Arguments.of(60, 301, 160, "Very good training efficiency\n" + "Your training score: 2.1666666666666665"),
                Arguments.of(59, 301, 161, "Very good training efficiency\n" + "Your training score: 2.0")
        );
    }
}