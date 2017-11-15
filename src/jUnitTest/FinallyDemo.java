package jUnitTest;

public class FinallyDemo {

	public static void main(String[] args) {
		int x = 10, y=0,z;
		
		try
		{
			System.out.println("Before dividing x by y.");
			z= x/y;
			System.out.println("After dividing x by y.");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside catch block-1.");
		}
        finally
        {
        	System.out.println("Inside finally block-1.");
        }
		System.out.println("---------------------------------");
		
		try
		{
			System.out.println("Before setting z to 1224.");
			z= 1224;
			System.out.println("After setting z to 1224.");
		}
		catch(Exception e)
		{
			System.out.println("Inside catch block-2.");
		}
        finally
        {
        	System.out.println("Inside finally block-2.");
        }
		System.out.println("---------------------------------");
		
		try
		{
			System.out.println("Inside try block-3");
			
		}
        finally
        {
        	System.out.println("Inside finally block-3.");
        }
		System.out.println("---------------------------------");
		
		try
		{
			System.out.println("Before executing System.exit()");
			System.exit(0);
			System.out.println("After executing System.exit()");
			
		}
        finally
        {
        	// This finally block will not be executed because application exits in try block
        	System.out.println("Inside finally block-4.");
        }
		System.out.println("---------------------------------");
	}
}
/*
Before dividing x by y.
Inside catch block-1.
Inside finally block-1.
---------------------------------
Before setting z to 1224.
After setting z to 1224.
Inside finally block-2.
---------------------------------
Inside try block-3
Inside finally block-3.
---------------------------------
Before executing System.exit()
*/
