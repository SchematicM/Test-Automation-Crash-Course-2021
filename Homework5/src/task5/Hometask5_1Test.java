package task5;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class Hometask5_1Test {

    @Test
    public void testIfThreeInInterval() {
        assertEquals(true, Hometask5_1.ifThreeInInterval(2, 3, 4, -5, 5));
        assertEquals(false, Hometask5_1.ifThreeInInterval(2, 3, 4, 3, 5));

    }
    @Test
    public void testMax() {
        assertEquals(3, Hometask5_1.max(2, 3, 1));
    }
}
