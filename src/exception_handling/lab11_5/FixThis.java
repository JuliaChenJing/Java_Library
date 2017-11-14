package exception_handling.lab11_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FixThis {
	// This method creates a compiler error -- try to fix it
	List<String> processList(List<String> list) {

		return list.stream().map(x -> FixThisSoln.handlingExceptions(x)).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		try {
			FixThis ft = new FixThis();
			List<String> words1 = Arrays.asList("not", "too", "big", "yet");
			System.out.println("------1st List Call------");
			System.out.println(ft.processList(words1));

			List<String> words2 = Arrays.asList("not", "too", "big", "exception");
			System.out.println("-----------2nd List Call-----");
			System.out.println(ft.processList(words2));

		} catch (Exception e) {

			//why not caught?
			System.out.println(e.getMessage());
		}
	}

}
