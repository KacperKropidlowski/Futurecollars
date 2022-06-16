import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinutesAndSecondsTest {

    @Test
    void shouldConvert5minutesToSeconds() {
        //given
        int value1 = 5;
        //when
        int result = MinutesAndSeconds.minutesToSeconds(value1);
        //then
        Assertions.assertEquals(300,result);
    }

    @Test
    void shouldConvert10minutesToSeconds() {
        //given
        int value1 = 10;
        //when
        int result = MinutesAndSeconds.minutesToSeconds(value1);
        //then
        Assertions.assertEquals( 600,result);
    }

    @Test
    void shouldConvert0minutesToSeconds() {
        //given
        int value1 = 0;
        //when
        int result = MinutesAndSeconds.minutesToSeconds(value1);
        //then
        Assertions.assertEquals( 0,result);
    }

    @Test
    void shouldConvert1minuteToSeconds() {
        //given
        int value1 = 1;
        //when
        int result = MinutesAndSeconds.minutesToSeconds(value1);
        //then
        Assertions.assertEquals( 60,result);
    }
}