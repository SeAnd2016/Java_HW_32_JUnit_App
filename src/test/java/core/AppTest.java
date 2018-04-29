package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testMinFunction() {
		assertEquals(4, App.minFunction(4, 8));
	}

	@Test
	public void testMaxFunction() {
		assertEquals(8, App.maxFunction(4, 8));
	}

	@Test
	public void testAvgFunction() {
		assertEquals("Wrong calculation", 6, App.avgFunction(4, 8));
	}

}
