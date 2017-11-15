package jUnitTest;

import java.util.Scanner;

public class AssertionDemo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 10: ");
		int number = input.nextInt();
		// assert that the value is >= 0 and <= 10
		assert (number >= 0 && number <= 10) : "bad number: " + number;
		System.out.printf("You entered %d%n", number);

		int sum = 0;

		assert sum < 10 : "I am not going to display the sum";
		System.out.println("Sum : " + sum);

		int x = 5;
		x++;
		assert x == 6 : "x is " + x;

	}
}

/*
 * Enter a number between 0 and 10: 23 You entered 23 Sum : 6 Before Assert x
 * After Assert
 * 
 */