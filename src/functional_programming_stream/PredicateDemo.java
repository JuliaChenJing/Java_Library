package functional_programming_stream;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class PredicateDemo{

	
	public static void main(String [] args)
	{
		
		Predicate <Integer> atLeast5=x->x>5;
		System.out.println("at least 5? "+atLeast5.test(3));
		List <Integer> list=Arrays.asList(1,5,6,10);
		list.stream().filter(atLeast5).collect(Collectors.toList()).forEach(System.out::println);

	}
	
	
}
/*
at least 5? false
6
10

*/
