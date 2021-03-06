package functional_programming_stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ConsumerDemo {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		list.forEach(consumer);
	}
	

	//choice one
//	public static Consumer<String> consumer = new Consumer<String>() {
//
//		@Override
//		public void accept(String t) {
//			
//		System.out.println(t.toUpperCase());
//		
//		}
//	};
	//choice two
	static Consumer<String> consumer = (s)->System.out.println(s.toUpperCase());
}
/*HELLO THERE
GOODBYE
BACK SOON
AWAY
ON VACATION
EVERYWHERE YOU WANT TO BE
*/
