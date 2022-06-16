import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RightTriangleTest {
    @Test
    void RightTriangle() {
        Assertions.assertTrue(RightTriangle.rightTriangle(3, 4, 5));
        Assertions.assertFalse(RightTriangle.rightTriangle(1, 1, 1));

    }
    @Test
    void ShouldCheckIsTriangle3_4_5aRightTriangle(){
        //given
        int edge1 = 3;
        int edge2 = 4;
        int edge3 = 5;
        //when
        boolean result = RightTriangle.rightTriangle(edge1,edge2,edge3);
        //then
        Assertions.assertTrue(result);
    }
    @Test
    void ShouldCheckIsTriangle1_1_1aRightTriangle(){
        //given
        int edge1 = 1;
        int edge2 = 1;
        int edge3 = 1;
        //when
        boolean result = RightTriangle.rightTriangle(edge1,edge2,edge3);
        //then
        Assertions.assertFalse(result);
    }
}