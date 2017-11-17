package exception_handling.run_time_unchecked_exception_try_catch;

public class IndexOutOfBoundsExceptionDemo {
	private static final double[] price = { 15.99, 27.88, 34.56, 45.89 };

	public static void displayPrice(int item) throws IndexOutOfBoundsException
	{
		System.out.println("The price is $" + price[item]);
	}

	public static void main(String[] args) {
		try {
			displayPrice(0);
			displayPrice(1);
			displayPrice(2);
			displayPrice(3);
			displayPrice(5);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("--------caught exception:"+e.getMessage());
			e.printStackTrace();
		}
	}
}


