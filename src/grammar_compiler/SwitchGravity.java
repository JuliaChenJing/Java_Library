package grammar_compiler;
import java.util.Scanner;

/**
 * Class: Fundamental Programming Practice <br />
 * 
 * @author "Jing Chen" <br />
 *         Description: Write a Program using switch statement to find the
 *         weight of a person in various planets according to the choice of user
 *         input. Get the input from the user in lbs..<br />
 */
public class SwitchGravity {

	public static void main(String[] args) {

		int input = 0;
		String planet;
		double relativeGravity = 0;

		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		while (true) {
			System.out.print("Input your weight: ");
			input = keyboard.nextInt();
			System.out.print("Input your planet: ");
			planet = keyboard.next();
			if (input > 0)

				break;

			else
				System.out.printf("Are you sure this is your weight?");

		}

		switch (planet) {
		case "Vinus":
			relativeGravity = 0.78;
			break;
		case "Mars":
			relativeGravity = 0.39;
			break;
		case "Jupiter":
			relativeGravity = 2.65;
			break;
		case "Saturn":
			relativeGravity = 1.17;
			break;
		case "Uranus":
			relativeGravity = 1.05;
			break;
		case "Neptune":
			relativeGravity = 1.23;
			break;

		default:
			System.out.println("Unknown planet");
			break;
		}
		System.out.printf("Your weight in the planet " + planet + "is " + relativeGravity * input);
	}

}

/*
 * Input your weight: 50 Input your planet: Vinus Your weight in the
 * planetVinus is 39.0
 */
