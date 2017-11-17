package functional_programming_stream;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {

		BinaryOperator<Integer> addLongs = (x, y) -> x + y;
		System.out.println(addLongs.apply(3, 2));

	}

}
/*
 * 5
 */
