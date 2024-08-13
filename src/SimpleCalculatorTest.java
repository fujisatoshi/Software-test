import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {

    @Test
    public void testAddition() {
        SimpleCalculator calculator = new SimpleCalculator();
        double result = calculator.calculate(5, 3, '+');
        assertEquals(8.0, result, 0.001);
    }

    @Test
    public void testSubtraction() {
        SimpleCalculator calculator = new SimpleCalculator();
        double result = calculator.calculate(5, 3, '-');
        assertEquals(2.0, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        SimpleCalculator calculator = new SimpleCalculator();
        double result = calculator.calculate(5, 3, '*');
        assertEquals(15.0, result, 0.001);
    }

    @Test
    public void testDivision() {
        SimpleCalculator calculator = new SimpleCalculator();
        double result = calculator.calculate(6, 3, '/');
        assertEquals(2.0, result, 0.001);
    }

    @Test
    public void testDivisionByZero() {
        SimpleCalculator calculator = new SimpleCalculator();
        double result = calculator.calculate(6, 0, '/');
        assertEquals(Double.POSITIVE_INFINITY, result, 0.001);
    }
}
