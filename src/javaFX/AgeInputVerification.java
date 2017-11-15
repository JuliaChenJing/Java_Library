package javaFX;

import javax.swing.JOptionPane;

public class AgeInputVerification {
	public int getAge(String prompt) {

		String inputStr;
		int age;
		while (true) {
			inputStr = JOptionPane.showInputDialog(null, prompt);
			try {
				age = Integer.parseInt(inputStr); // wrong input will take to

				return age; // correct input, we get out
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "'" + inputStr + "' is invalid\n" + "Please enter digits only");
				System.out.println(e.getMessage());

			}

			finally {
				System.out.println("End");
			}
		}
	}

	public static void main(String[] args) {
		AgeInputVerification ag = new AgeInputVerification();
		int age = ag.getAge("Please type in your age");
		System.out.println(age);
	}
}
