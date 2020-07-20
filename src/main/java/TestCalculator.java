import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    private Calculator c;

    @Before
    public void setup() {
        c = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(8, c.add(5, 3));
    }
    @Test
    public void testSubtract() {
        assertEquals(2, c.subtract(5, 3));
    }
    @Test
    public void testMultiply() {
        assertEquals(15, c.multiply(5, 3));
    }
    @Test
    public void testDivide() {
        assertEquals(1, c.divide(5, 3));
    }
}
