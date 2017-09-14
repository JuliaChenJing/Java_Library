package junit_test;
import static org.junit.Assert.*;

import org.junit.Test;

public class MinTest {

	@Test
	public void testMin() {

		int[] data = { 2, -21, 3, 45, 0, 12 };
		int min = Min.min(data);

//		assertEquals(min, -22);
		
		//better way
		assertTrue(isExist(min, data));
		assertTrue(isMin(min, data));

	}

	private boolean isMin(int min, int[] data) {
		for (int i = 0; i < data.length; i++) {
			if (min > data[i])
				return false;
		}
		return true;
	}

	private boolean isExist(int min, int[] data) {
		for (int i = 0; i < data.length; i++) {
			if (min == data[i])
				return true;
		}
		return false;
	}

}
