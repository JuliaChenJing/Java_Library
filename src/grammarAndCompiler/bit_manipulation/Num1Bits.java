package grammarAndCompiler.bit_manipulation;

public class Num1Bits {
	/*
	 * Write a function that takes an unsigned integer and returns the number of
	 * 1 bits it has.
	 */
	public static int num1Bits(long a) {

		int count = 0;
		while (a != 0) {
			count += a & 1;
			a >>= 1;
		}
		return count;
	}

	public static void main(String[] args) {
		int a = 00000000000000000000000000001011;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(num1Bits(a));
	}

}
