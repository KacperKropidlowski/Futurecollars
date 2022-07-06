package Task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToUpperCaseFormatterTest {

    @Test
    void shouldUpperCase() {
        //given
        ToUpperCaseFormatter toUpperCaseFormatter = new ToUpperCaseFormatter();
        String text = "Szedł Sasza suchą szosą";
        //when
        String result = toUpperCaseFormatter.formatText(text);
        //then
        Assertions.assertEquals("SZEDŁ SASZA SUCHĄ SZOSĄ", result);
    }
}