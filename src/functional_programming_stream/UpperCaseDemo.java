package functional_programming_stream;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;
public class UpperCaseDemo {

	public static void main(String [] args)
	{
		
		  List <String> collected=Stream.of("a","b","hello")
				  .map(  s->s.toUpperCase()  )
				  .collect(Collectors.toList());
		  System.out.println(collected);
	}
		
}
/*
[A, B, HELLO]
*/
