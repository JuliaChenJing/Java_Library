package exception_handling.run_time_unchecked_exception_try_catch;


public class NotEnoughMoneyExceptionDemo {

	String Cus_name;
	String Acc_No;
	double Balance;

	public NotEnoughMoneyExceptionDemo(String cus_name, String acc_No, double balance) {
		super();
		Cus_name = cus_name;
		Acc_No = acc_No;
		Balance = balance;
	}

	public void deposit(double de) {
		Balance += de;
	}

	public void withdraw(double wi) {
		System.out.println("you are going to withdraw some money~~~");
		try {
			if (Balance < wi) {
				UnsupportedOperationException e = new UnsupportedOperationException("Not enough money, Sorry");
				throw e;
			} else
			{
				Balance -= wi;
				System.out.println("Draw Money & enjoy, Have a good day.\n");
			}
			
		}
		 catch (UnsupportedOperationException e) {
				System.out.println("Not enough money, sorry.\n");
			} 
		
	}

	public static void main(String[] args) {
		NotEnoughMoneyExceptionDemo ca = new NotEnoughMoneyExceptionDemo("Julia", "12345", 120);
		double withdrawMoney = 70;
		ca.withdraw(withdrawMoney);
		try {
			
			if (ca.Balance < 100) {
				MyException e = new MyException(100);
				throw e;
			} 

		} catch (MyException e) 
		{
			System.out.println("in main:your balance is below 100.\n");
		}
		ca.withdraw(withdrawMoney);
		System.out.println("End");
	}
}

@SuppressWarnings("serial")
class MyException extends Exception {
	MyException() {
		System.out.println("Warning:your balance is below 100.\n");
	}

	MyException(int n) {
		System.out.println("Warning:your balance is below 100.\n");
	}
}
/*
 you are going to withdraw some money~~~
Draw Money & enjoy, Have a good day.

Warning:your balance is below 100.

you are going to withdraw some money~~~
Not enough money, sorry.

End

 */
