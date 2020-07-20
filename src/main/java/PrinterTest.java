import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer p;

    @Before
    public void setup() {
        p = new Printer(50);
    }

    @Test
    public void testPrintOne() {
        p.print(1, 1);
        assertEquals(49, p.getSheetsLeft());
    }

    @Test
    public void testPrintFive() {
        p.print(5, 1);
        assertEquals(45, p.getSheetsLeft());
    }

    @Test
    public void testPrintFifteen() {
        p.print(5, 3);
        assertEquals(35, p.getSheetsLeft());
    }

    @Test
    public void testPrintTooMany() {
        p.print(30, 8);
        assertEquals(50, p.getSheetsLeft());
    }
}
