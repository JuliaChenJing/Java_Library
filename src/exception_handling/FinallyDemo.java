package exception_handling;

public class FinallyDemo {

	public static void main(String[] args) {
		
		
		int nums[] = new int[4];
		try {
			// 1
			System.out.println("Before exception is generated.");
			// Generate an index out-of-bounds exception.
			// 2
			nums[4] = 10;
			// 3
			System.out.println("End of try");
		}

		catch (ArrayIndexOutOfBoundsException exc) {
			// catch the exception
			// 4
			System.out.println("Index out-of-bounds!");
		}

		finally {
			// 5
			System.out.println("End of try catch block");
		}
		
		System.out.println("---------------------------------");
		
		int x = 10, y = 0,z;
		
		try {
			System.out.println("Before dividing x by y.");
			z = x / y;
			System.out.println("After dividing x by y.");
		} catch (ArithmeticException e) {
			System.out.println("Inside catch block-1.");
		} finally {
			System.out.println("Inside finally block-1.");
		}
		System.out.println("---------------------------------");

		try {
			System.out.println("Before setting z to 1224.");
			z = 1224;
			System.out.println("After setting z to 1224.");
		} catch (Exception e) {
			System.out.println("Inside catch block-2.");
		} finally {
			System.out.println("Inside finally block-2.");
		}
		System.out.println("---------------------------------");

		try {
			System.out.println("Inside try block-3");

		} finally {
			System.out.println("Inside finally block-3.");
		}
		System.out.println("---------------------------------");

		try {
			System.out.println("Before executing System.exit()");
			System.exit(0);
			System.out.println("After executing System.exit()");

		} finally {
			// This finally block will not be executed because application exits
			// in try block
			System.out.println("Inside finally block-4.");
		}
		System.out.println("---------------------------------");

	
	}
}

