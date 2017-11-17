package functional_programming_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {
	
	public static void main(String [] args)
	{
		List <Integer> digits=Arrays.asList(1,3,5);
		Integer sum1 = digits.stream().reduce(0,(x, y) -> x + y);
		Integer multiplication = digits.stream().reduce(1,(x, y) -> x * y);
		Optional<Integer> sum2 = digits.stream().reduce((x, y) -> x + y);
		
		System.out.println(sum1);
		System.out.println(sum2.get());
		System.out.println(multiplication);
		
		List <String> str=Arrays.asList("Julia","Bimal","Ashutosh");
		Optional<String> sum3 = str.stream().reduce((x, y) -> x +","+ y);
		System.out.println(sum3.get());
		
		Stream <String> stream=Stream.of("Julia","Bimal","Ashutosh");
		
		String re=stream.reduce("",(x,y)->
		{
			StringBuilder sb=new StringBuilder();
			sb.append(x);
			sb.append(" ");
			sb.append(y);
			return sb.toString();
		});
		
		System.out.println(re);
		
		
	}

}
/*
9
9
15
Julia,Bimal,Ashutosh
 Julia Bimal Ashutosh
 */
