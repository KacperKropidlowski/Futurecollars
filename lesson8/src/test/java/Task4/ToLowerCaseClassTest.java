package Task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToLowerCaseClassTest {

    @Test
    void shouldLowerCase() {
        //given
        ToLowerCaseClass toLowerCaseClass = new ToLowerCaseClass();
        String text = "Szedł Sasza suchą szosą";
        //when
        String result = toLowerCaseClass.formatText(text);
        //then
        Assertions.assertEquals("szedł sasza suchą szosą", result);
    }
}