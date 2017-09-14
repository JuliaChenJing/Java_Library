package functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		list.forEach(consumer);
	}
	

	public static Consumer<String> consumer = new Consumer<String>() {

		@Override
		public void accept(String t) {
			
		System.out.println(t.toUpperCase());
		}
	};
}
/*HELLO THERE
GOODBYE
BACK SOON
AWAY
ON VACATION
EVERYWHERE YOU WANT TO BE
*/
