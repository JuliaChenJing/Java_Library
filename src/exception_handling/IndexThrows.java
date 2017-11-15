package exception_handling;

public class IndexThrows {
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
			
			e.printStackTrace();
		}
	}
}


