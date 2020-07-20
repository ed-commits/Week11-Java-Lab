import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWaterBottle {
    private WaterBottle w;

    @Before
    public void setup() {
        w = new WaterBottle();
    }

    @Test
    public void testVolumeStartsHundred() {
        assertEquals(100, w.getVolume(), 0.001);
    }

    @Test
    public void testDrinkTen() {
        w.drink();
        assertEquals(90, w.getVolume(), 0.001);
        w.drink();
        assertEquals(80, w.getVolume(), 0.001);
    }

    @Test
    public void testEmpty() {
        w.empty();
        assertEquals(0, w.getVolume(), 0.001);
    }

    @Test
    public void testFill() {
        w.empty();
        w.fill();
        assertEquals(100, w.getVolume(), 0.001);
    }
}
