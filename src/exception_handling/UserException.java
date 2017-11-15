package exception_handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class DefinedException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	DefinedException() {
		System.out.println("Error:Password too short");
	}

	DefinedException(int n) {
		System.out.println("You are only "+n+" years old. Only adults can join");
	}
}

public class UserException {

	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter user name : ");
			String n = br.readLine();
			System.out.print("Enter your password : ");
			String m = br.readLine();
			if (m.length() < 6)
				throw new DefinedException();
			System.out.print("Enterd your age : ");
			int o = Integer.parseInt(br.readLine());
			if (o < 18)
				throw new DefinedException(o);
		} 
		catch (Exception e) {
		} 
		finally {
			System.out.println("End");
		}
	}
}
/*
Enter user name : julia
Enter your password : basd
Error:Password too short
End

Enter user name : Julia
Enter your password : 285160
Enterd your age : 12
You are only 12 years old. Only adults can join
End


*/