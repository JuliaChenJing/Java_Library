package grammar_compiler.bit_manipulation;

/*
 * You are given two 32-bit numbers, N and M, and two bit positions, i and j. Write a
method to set all bits between i and j in N equal to M (e.g., M becomes a substring of
N located at i and starting at j).

     * EXAMPLE: 
	 * Input: N = 100 0000 0000, M = 10101, i = 2, j = 6 
	 * Output: N =1000 10101 00 
	 *                 65432
 */
public class UpdateBits {

	/*
	 * This code operates by clearing all bits in N between position i and j,
	 * and then ORing to put M in there
	 */
	public static int updateBits(int n, int m, int i, int j) {
		int max = ~0; /* All 1’s */

		// 1’s through position j, then 0’s
		int left = max - ((1 << j) - 1);

		// 1’s after position i
		int right = ((1 << i) - 1);

		// 1’s, with 0s between i and j
		int mask = left | right;

		// Clear i through j, then put m in there
		return (n & mask) | (m << i);
	}

	public static void main(String[] args) {
		int n = 1000000000;
		int m = 10101;
		int i = 2;
		int j = 6;
		int result = updateBits(n, m, i, j);
		System.out.println(result);
	}
}