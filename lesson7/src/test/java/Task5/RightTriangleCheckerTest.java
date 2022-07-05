package Task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RightTriangleCheckerTest {

    @Test
    void ShouldCheckIfTriangleIsRightTriangle() {
        //given
        int edge1 = 3;
        int edge2 = 4;
        int edge3 = 5;
        //when
        boolean result = RightTriangleChecker.isRightTriangle(edge1, edge2, edge3);
        //then
        Assertions.assertTrue(result);
    }

    @Test
    void ShouldCheckIfTriangleIsNotRightTriangle() {
        //given
        int edge1 = 1;
        int edge2 = 1;
        int edge3 = 1;
        //when
        boolean result = RightTriangleChecker.isRightTriangle(edge1, edge2, edge3);
        //then
        Assertions.assertFalse(result);
    }
}