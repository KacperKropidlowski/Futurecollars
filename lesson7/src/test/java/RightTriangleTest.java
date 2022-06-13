import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RightTriangleTest {
    @Test
    void RightTriangle() {
        Assertions.assertTrue(RightTriangle.rightTriangle(3, 4, 5));
        Assertions.assertFalse(RightTriangle.rightTriangle(1, 1, 1));

    }
}