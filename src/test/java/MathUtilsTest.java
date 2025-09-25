import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*
        ;

public class MathUtilsTest {

    @Test
    public void testSum() {
        assertEquals(7, MathUtils.sum(3, 4));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, MathUtils.multiply(3, 4));
    }
    @Test
    public void testDiv(){
        assertEquals(4, MathUtils.div(16, 4));
    }
    @Test
    public void testSqrt(){
        assertEquals(4, MathUtils.sqrt(16));
    }
    @Test
    public void testFactorial(){
        assertEquals(6, MathUtils.factorial(3));
    }

    @Test
    public void TestDivByZero(){
        assertThrows(ArithmeticException.class, () ->  MathUtils.div(7,0));
    }

//    @Test
//    public void TestDivError(){
//       assertEquals(5, MathUtils.div(16, 4));
//    }

}
