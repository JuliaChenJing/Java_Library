package exception_handling;

import javax.swing.JOptionPane;

public class IntegerInputVerification {
	public int getAge(String prompt) {

		String inputStr;
		int mark;
		while (true) {
			inputStr = JOptionPane.showInputDialog(null, prompt);
			try {
				mark = Integer.parseInt(inputStr); // wrong input will take to

				if (mark < 0)
					throw new Exception();

				return mark; // correct input, we get out
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "'" + inputStr + "' is invalid\n" + "Please enter marks only");
				System.out.println(e.getMessage());

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,
						"'" + inputStr + "' is invalid\n" + "Please enter positive integers only");
				System.out.println(e.getMessage());
			}

		}
	}

	public static void main(String[] args) {
		IntegerInputVerification ag = new IntegerInputVerification();
		int mark = ag.getAge("Please type in a positive integer");
		System.out.println(mark);
	}
}

/*
 For input string: "ab"
Error:not a positive mark
null
12
*/
