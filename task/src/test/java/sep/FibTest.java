package sep;

import static org.junit.Assert.*;

import java.util.Random;

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
