package exception_handling.user_defined_exception;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	// This method creates a compiler error -- try to fix it
	List<String> processList(List<String> list) {

		return list.stream().map(x -> WordLengthException.handlingExceptions(x)).collect(Collectors.toList());

	}

	public static void main(String[] args) {

		try {
			App ft = new App();
			List<String> words1 = Arrays.asList("not", "too", "big", "yet");
			System.out.println("------1st List Call------");
			System.out.println(ft.processList(words1));

			List<String> words2 = Arrays.asList("not", "too", "big", "exception");
			System.out.println("-----------2nd List Call-----");
			System.out.println(ft.processList(words2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
