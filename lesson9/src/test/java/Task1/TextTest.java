package Task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextTest {

    @Test
    void shouldCheckExistenceOfContent() {
        //given
        String text1 = "";
        String text2 = "kajak";
        //when
        boolean result1 = Text.checkExistenceOfContent(text1);
        boolean result2 = Text.checkExistenceOfContent(text2);
        //then
        Assertions.assertFalse(result1);
        Assertions.assertTrue(result2);

    }

    @Test
    void shouldCheckIsPalindrome() {
        //given
        String text1 = "";
        String text2 = "kajak";
        //when
        boolean result1 = Text.isPalindrome(text1);
        boolean result2 = Text.isPalindrome(text2);
        //then
        Assertions.assertFalse(result1);
        Assertions.assertTrue(result2);
    }

    @Test
    void shouldGetTextLength() {
        //given
        String text1 = "";
        String text2 = "kajak";
        //when
        int result1 = Text.getTextLength(text1);
        int result2 = Text.getTextLength(text2);
        //then
        Assertions.assertEquals(0,result1);
        Assertions.assertEquals(5,result2);
    }
}