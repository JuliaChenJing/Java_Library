package jUnitTest.test_duplicates;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestRemoveDups {

	
	@Test
	public void testRemoveDups() {
		String[] arr = { "horse", "boy", "horse", "boy", "boy" };
		String[] expected = { "horse", "boy" };

		
		String [] result=RemoveDupsClass.removeDups(arr);
		assertEquals(expected,result);
		
		//hard code the result and verify
		assertTrue(Arrays.equals(expected, result));
		assertArrayEquals(expected, result);
		
		//using methods to verify
		//every String in expected is in  result
		assertTrue(isExist(expected, RemoveDupsClass.removeDups(arr)));
		//every String in result is in expected
		assertTrue(isExist(RemoveDupsClass.removeDups(arr), expected));
		//the String in expected only existes once
		assertTrue(eachStringOnlyOne(result));
	}

	private boolean isExist(String[] expected, String [] arr) {
		for(String a:expected)
		for (String i:arr) {
			if (a.compareTo(i)==0)
				return true;
		}
		return false;
	}
	
	private boolean eachStringOnlyOne(String[] arr) {
		
		Map<String, Integer> map = new HashMap<>();
		for(String str: arr){
			if(map.containsKey(str))
				return false;
			else 
				map.put(str,1);
		}
		return true;
	}
}
