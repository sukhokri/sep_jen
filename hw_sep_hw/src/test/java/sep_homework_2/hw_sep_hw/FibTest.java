package sep_homework_2.hw_sep_hw;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FibTest {

    @Test
    public void testCount() {
        Fib f = new Fib();
        int value = f.count(10);
        assertTrue(value == 55);
        value = f.count(-10);
        assertTrue(value == -10);
    }

}
