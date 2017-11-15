package exception_handling;

public class BalanceThrows {
	public static void main(String[] args) 
	{
		int balance = 100, withdraw = 200;
		try {
			if (balance < withdraw) {
				UnsupportedOperationException e = new UnsupportedOperationException("No money, Sorry");
				throw e;
			} 
			else 
			{
				System.out.println("Draw Money & enjoy, Have a good day.");
			}
			System.out.println("End");
		} catch (Exception e) {
			System.out.println("~~~Caught an exception.");
			e.printStackTrace();
		}
		finally{
			System.out.println("~~~Finally.");
		}
	}
}
/*
Exception in thread "main" java.lang.UnsupportedOperationException: No money, Sorry
	at package3.BalanceThrow.main(BalanceThrow.java:8)
*/
