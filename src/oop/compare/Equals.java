package oop.compare;

import java.util.Arrays;

public class Equals {

	/*
	 * What is the difference between “==” and “equals(…)” in comparing Java
	 * String objects?
	 * 
	 * When you use “==” (i.e. shallow comparison), you are actually comparing
	 * the two object references to see if they point to the same object. When
	 * you use “equals(…)”, which is a “deep comparison” that compares the
	 * actual string values.
	 */
	public static void main(String[] args) {

		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 3 };

		System.out.println("a == b    :" + (a == b));// false
		System.out.println("a.equals(b)    :" + a.equals(b));// false
		System.out.println("Arrays.equals(a, b)   :" + Arrays.equals(a, b));// true

		Object[] o1 = { a };
		Object[] o2 = { b };
		System.out.println("Arrays.equals(o1, o2)   :" + Arrays.equals(o1, o2));// false
		System.out.println("Arrays.deepEquals(o1, o2)   :" + Arrays.deepEquals(o1, o2));// true

		String s1 = "Hello";
		String s2 = new String(s1);
		String s3 = "Hello";

		System.out.println(s1 + " equals " + s2 + "--> " + s1.equals(s2)); // true

		System.out.println(s1 + " == " + s2 + " --> " + (s1 == s2)); // false
		System.out.println(s1 + " == " + s3 + " --> " + (s1 == s3)); // true

		String bimal1 = "Bimal";
		String bimal2 = "Bimal";
		System.out.println(bimal1.equals(bimal2));// true
		System.out.println(bimal1 == bimal2);// true

		StringBuilder bimal3 = new StringBuilder("Bimal");
		StringBuilder bimal4 = new StringBuilder("Bimal");

		System.out.println(bimal3.equals(bimal4));// false
		System.out.println(bimal3 == bimal4);// false

		System.out.println(checkAnagram("bimal", "mailb"));// true

	}

	// Write a method to decide if two strings are anagrams （颠倒字母而成的字） or not
	private static boolean checkAnagram(String string1, String string2) {
		char[] array1 = string1.toCharArray();
		char[] array2 = string2.toCharArray();

		Arrays.sort(array1);
		Arrays.sort(array2);

		if (Arrays.equals(array1, array2))
			return true;
		else
			return false;
	}

}
