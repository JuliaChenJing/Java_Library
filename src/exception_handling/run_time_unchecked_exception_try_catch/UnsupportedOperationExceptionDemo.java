package exception_handling.run_time_unchecked_exception_try_catch;

public class UnsupportedOperationExceptionDemo {
	public static void main(String[] args) {
		int balance = 100, withdraw = 200;
		try {
			if (balance < withdraw) {
				throw new UnsupportedOperationException("No money, Sorry");
				
			} else {
				System.out.println("Draw Money & enjoy, Have a good day.");
			}
			System.out.println("End");
		} catch (Exception e) {
			System.out.println("~~~Caught an exception.");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("~~~Finally.");
		}
	}
}
/*
 * Exception in thread "main" java.lang.UnsupportedOperationException: No money,
 * Sorry at package3.BalanceThrow.main(BalanceThrow.java:8)
 */
