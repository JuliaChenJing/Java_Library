package functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		list.forEach(consumerFunction2);
		for(String s: list){
			System.out.println(s);
		}
	}
	
	static Consumer<String> consumerFunction2 = String::toUpperCase;
	
	
	
}
