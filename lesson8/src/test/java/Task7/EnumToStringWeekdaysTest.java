package Task7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EnumToStringWeekdaysTest {
    @Test
    void shouldConvertWeekdayEnumToString(){
        //given
        EnumToStringWeekdays monday = new EnumToStringWeekdays(EnumWeekdays.Monday);
        //when
        String result = monday.enumToStringWeekdays();
        //then
        Assertions.assertEquals("Monday",result);
    }
}