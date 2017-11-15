package oop.compare;


import java.util.Arrays;

//Write a method to decide if two strings are anagrams （颠倒字母而成的字） or not
public class Equals{

	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3 };
		int b[] = { 1, 2, 3 };
		
		System.out.println(a==b);// false
		System.out.println(a.equals(b));// false
		System.out.println(Arrays.equals(a, b));// true
	

		Object[] o1 = { a };
		Object[] o2 = { b };
		System.out.println(Arrays.equals(o1, o2));//false
		System.out.println(Arrays.deepEquals(o1, o2));//true

		String bimal1 = "Bimal";
		String bimal2 = "Bimal";
		System.out.println(bimal1.equals(bimal2));// true
		System.out.println(bimal1 == bimal2);// true

		System.out.println(checkAnagram("bimal", "mailb"));// true

	}

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
