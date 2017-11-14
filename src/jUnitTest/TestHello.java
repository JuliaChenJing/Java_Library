package JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHello {


	
	@Test
	public static void testMyMethod() {
		String returnString = Hello.hello();
		assertEquals("equal", "Hello", returnString);
	}
	
	@Test
	public static void testMyMethod1() {
		String returnString = Hello.hello();
		assertEquals("Hello", returnString);
	}

}
