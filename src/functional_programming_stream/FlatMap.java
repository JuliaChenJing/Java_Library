package functional_programming_stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class FlatMap {

	public static void main(String [] args)
	{
		
		  List <Integer> collected=Stream.of(Arrays.asList(1,2,3),Arrays.asList(4,5,6))
				  .flatMap(  a->a.stream()  )
				  .collect(Collectors.toList());
		  System.out.println(collected);
	}
		
}
/*
[1, 2, 3, 4, 5, 6]
*/
