package Task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void shouldGetAreaOfRectangle() {
        //given
        Rectangle rectangle = new Rectangle(4, 5);
        //when
        double result = rectangle.getArea();
        //then
        Assertions.assertEquals(20, result);
    }

    @Test
    void shouldGetPerimeterOfRectangle() {
        //given
        Rectangle rectangle = new Rectangle(4, 5);
        //when
        double result = rectangle.getPerimeter();
        //then
        Assertions.assertEquals(18, result);
    }

}