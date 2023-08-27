import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MainTest {

    public static int subtraction(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    public static int multiplication(int multiplier, int multiplicand) {
        return multiplier * multiplicand;
    }

    @Test
    public void testSubtraction1() {
        int result = subtraction(10, 5);
        assertEquals(5, result, "Subtraction of 10 - 5 should be 5");
    }

    @Test
    public void testSubtraction2() {
        int result = subtraction(20, 10);
        assertEquals(10, result, "Subtraction of 20 - 10 should be 10");
    }

    @Test
    public void testMultiplication1() {
        int result = multiplication(20, 2);
        assertEquals(40, result, "Subtraction of 20 * 2 should be 40");
    }

    @Test
    public void testMultiplication2() {
        int result = multiplication(10, 5);
        assertEquals(50, result, "Multiplication of 10 * 5 should be 50");
    }
}

