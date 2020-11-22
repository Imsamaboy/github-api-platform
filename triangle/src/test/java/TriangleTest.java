import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle isoscelesTriangle_1 = new Triangle(new Point(0, 0), new Point(0, 1), new Point(1, 0));
    Triangle isoscelesTriangle_2 = new Triangle(new Point(0, 0), new Point(0, 1), new Point(1, 0));
    Triangle rightTriangle_1 = new Triangle(new Point(0, 0), new Point(0, 1), new Point(20, 0));
    Triangle rightTriangle_2 = new Triangle(new Point(0, 0), new Point(1, 0), new Point(0, 20));
    Triangle equilateralTriangle_1 = new Triangle(new Point(0, 0), new Point(1, 0),
                                                  new Point(0.5, Math.sqrt(3)/2));
    Triangle equilateralTriangle_2 = new Triangle(new Point(0, 0), new Point(10, 0),
                                                  new Point(5, 5 * Math.sqrt(3)));
    Triangle itIsNotTriangle_1 = new Triangle(new Point(0, 0), new Point(0, 0), new Point(0, 0));
    Triangle itIsNotTriangle_2 = new Triangle(new Point(-1, -1), new Point(0, 0), new Point(1, 1));
    Triangle itIsNotTriangle_3 = new Triangle(new Point(-1, -1), new Point(-1, -1), new Point(10, 10));

    @Test
    void getSideLength() {
        assertEquals(1.0, isoscelesTriangle_1.getSideLength(isoscelesTriangle_1.getA(),
                                                                  isoscelesTriangle_1.getB()));

        assertEquals(Math.sqrt(2), isoscelesTriangle_1.getSideLength(isoscelesTriangle_1.getB(),
                                                                  isoscelesTriangle_1.getC()));
    }

    @Test
    void getSquare() {
        assertEquals(1.0, isoscelesTriangle_1.getSquare());
        assertEquals(1.0, isoscelesTriangle_2.getSquare());
        assertEquals(1.0, rightTriangle_1.getSquare());
        assertEquals(1.0, rightTriangle_2.getSquare());
        assertEquals(1.0, equilateralTriangle_1.getSquare());
        assertEquals(1.0, equilateralTriangle_2.getSquare());

        assertEquals(0, itIsNotTriangle_1.getSquare());
        assertEquals(0, itIsNotTriangle_2.getSquare());
        assertEquals(0, itIsNotTriangle_3.getSquare());
    }

    @Test
    void isIsosceles() {
        assertTrue(isoscelesTriangle_1.isIsosceles());
        assertTrue(isoscelesTriangle_2.isIsosceles());
        assertFalse(rightTriangle_1.isIsosceles());
        assertFalse(rightTriangle_2.isIsosceles());
        assertTrue(equilateralTriangle_1.isIsosceles());
        assertTrue(equilateralTriangle_2.isIsosceles());

        assertFalse(itIsNotTriangle_1.isIsosceles());
        assertFalse(itIsNotTriangle_2.isIsosceles());
        assertFalse(itIsNotTriangle_3.isIsosceles());
    }
}