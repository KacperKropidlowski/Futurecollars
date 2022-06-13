import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinutesAndSecondsTest {
    @Test
    void minutesToSeconds() {
        Assertions.assertEquals(MinutesAndSeconds.minutesToSecond(5), 300);
        Assertions.assertEquals(MinutesAndSeconds.minutesToSecond(10), 600);
        Assertions.assertEquals(MinutesAndSeconds.minutesToSecond(0), 0);
        Assertions.assertEquals(MinutesAndSeconds.minutesToSecond(1), 60);
    }
}