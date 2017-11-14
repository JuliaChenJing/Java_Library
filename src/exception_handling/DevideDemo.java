package exception_handling;

public class DevideDemo {
	public static void main(String[] args) {
		int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 1, 4, 4, 0, 8 };
		int re[][] = new int[numer.length][denom.length];

		try {
			for (int i = 0; i < numer.length + 1; i++)
				for (int j = 0; j < denom.length; j++)
					System.out.println(re[i][j] = numer[i] / denom[j]);
		}

		catch (ArithmeticException exc) {

			System.out.println("Arithmetic Exception!");
		} catch (ArrayIndexOutOfBoundsException exc) {

			System.out.println("Array Index Out Of Bounds Exception!");
		}

	}
}
