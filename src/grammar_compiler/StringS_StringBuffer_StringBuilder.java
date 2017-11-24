package grammar_compiler;

import java.util.Arrays;

public class StringS_StringBuffer_StringBuilder {

	/*
	 * StringBuffer is thread safe stringBuilder is not thread safe
	 * 
	 * String 字符串常量 StringBuffer 字符串变量（线程安全） tringBuilder 字符串变量（非线程安全）
	 * 
	 * 
	 * Q4. Why String class has been made immutable in Java?
	 * 
	 *  A4. For performance
	 * & thread-safety.
	 * 
	 * 1. Performance: Immutable objects are ideal for representing values of
	 * abstract data (i.e. value objects) types like numbers, enumerated types,
	 * etc. If you need a different value, create a different object. In Java,
	 * Integer, Long, Float, Character, BigInteger and BigDecimal are all
	 * immutable objects. Optimization strategies like caching of hashcode,
	 * caching of objects, object pooling, etc can be easily applied to improve
	 * performance. If Strings were made mutable, string pooling would not be
	 * possible as changing the string with one reference will lead to the wrong
	 * value for the other references.
	 * 
	 * [ Further reading: Java immutable objects interview Q&As | Builder
	 * pattern and immutability in Java ]
	 * 
	 * 2. Thread safety as immutable objects are inherently thread safe as they
	 * cannot be modified once created. They can only be used as read only
	 * objects. They can easily be shared among multiple threads for better
	 * scalability.
	 */
	public static void main(String[] args) {
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
