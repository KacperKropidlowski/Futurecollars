package Task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToLowerCaseFormatterTest {

    @Test
    void shouldLowerCase() {
        //given
        ToLowerCaseFormatter toLowerCaseFormatter = new ToLowerCaseFormatter();
        String text = "Szedł Sasza suchą szosą";
        //when
        String result = toLowerCaseFormatter.formatText(text);
        //then
        Assertions.assertEquals("szedł sasza suchą szosą", result);
    }
}