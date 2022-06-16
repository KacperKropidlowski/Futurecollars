package Task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void shouldGetAreaOfCircleRadius7() {
        //given
        Circle circle = new Circle(7);
        //when
        double result = circle.getArea();
        //then
        Assertions.assertEquals(153.93804002589985,result);
    }

    @Test
    void shouldGetPerimeterOfCircleRadius7() {
        //given
        Circle circle = new Circle(7);
        //when
        double result = circle.getPerimeter();
        //then
        Assertions.assertEquals(43.982297150257104,result);
    }
}