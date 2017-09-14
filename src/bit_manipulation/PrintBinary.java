package bit_manipulation;

/*
 *  Given a (decimal - e.g. 3.72) number that is passed in as a string, 
 *  print the binary representation. If the number can not be represented 
 *  accurately in binary, print "ERROR"
 */
public class PrintBinary {

	public static void main(String[] args) {
		System.out.println(printBinary("2.25"));
		System.out.println(printBinary("0.25"));
		System.out.println(printBinary("8.25"));
		System.out.println(printBinary("0.0"));
	}

	/*
	 * First, let’s start off by asking ourselves what a non-integer number in
	 * binary looks like. By analogy to a decimal number, the number n = 0.101 =
	 * 1 * (1/2^1) + 0 * (1/2^2) + 1 * (1/2^3).
	 * 
	 * Printing the int part of n is straight-forward (see below).
	 * 
	 * To print the decimal(�?数) part, we can multiple by 2 and check if the 2*n
	 * is greater than or equal to one. This is essentially “shifting�? the
	 * fractional sum. That is: r = 2*n = 2*0.101 = 1*(1 / 2^0) + 0*(1 / 2^1) +
	 * 1*(1 / 2^2) = 1.01 If r >= 1, then we know that n had a 1 right after the
	 * decimal point. By doing this continuously, we can check every digit.
	 * 
	 */
	public static String printBinary(String n) {
		// obtain the intPart
		int intPart = Integer.parseInt(n.substring(0, n.indexOf('.')));
		// obtain the decimal Part
		double decPart = Double.parseDouble(n.substring(n.indexOf('.'), n.length()));

		String int_string = "";
		while (intPart > 0) {
			int r = intPart % 2;
			intPart >>= 1;// �?�移一�?
			int_string = r + int_string;// the new number should be added at the
										// left
		}

		StringBuffer dec_string = new StringBuffer();
		while (decPart > 0) {
			if (dec_string.length() > 32)
				return "ERROR";
			if (decPart == 1) {
				dec_string.append((int) decPart);
				break;
			}
			double r = decPart * 2;
			if (r >= 1) {
				dec_string.append(1);
				decPart = r - 1;
			} else {
				dec_string.append(0);
				decPart = r;
			}
		}
		return int_string + "." + dec_string.toString();
	}

}
