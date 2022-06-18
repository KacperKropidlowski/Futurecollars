package Task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToUpperCaseClassTest {

    @Test
    void shouldUpperCase() {
        //given
        ToUpperCaseClass toUpperCaseClass = new ToUpperCaseClass();
        String text = "Szedł Sasza suchą szosą";
        //when
        String result = toUpperCaseClass.formatText(text);
        //then
        Assertions.assertEquals("SZEDŁ SASZA SUCHĄ SZOSĄ", result);
    }
}