package grammar_compiler.bit_manipulation;

/*
 * Write a function to determine the number of bits required to convert integer A to
integer B.
    Input: 31, 14
    31 =11111
    14 =01110
    Output: 2
 */
public class BitSwapRequired {
	/*
	 * This seemingly complex problem is actually rather straightforward. To
	 * approach this, ask yourself how you would figure out which bits in two
	 * numbers are different. Simple: with an xor. Each 1 in the xor will
	 * represent one different bit between A and B. We then simply need to count
	 * the number of bits that are 1.
	 * 
	 */

	public static void main(String[] args) {
		System.out.println(bitSwapRequired(31, 14));
	}

	public static int bitSwapRequired(int a, int b) {
		int count = 0;
		int c = a ^ b;
		
		while(c != 0)
		{
			count += c & 1;
			c = c >> 1;
		}
		
		return count;
	}
}
