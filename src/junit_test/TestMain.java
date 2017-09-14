package junit_test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMain {

	@Test
	public void testHello(){
		String hello = Hello.hello();
		assertEquals("Hello", hello);
	}
}
