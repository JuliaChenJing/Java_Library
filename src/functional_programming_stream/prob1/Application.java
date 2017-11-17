package functional_programming_stream.prob1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Application {

	public static void main(String[] args) {
		// load up some test data
		Customer cust1 = new Customer("Bob", "11 Adams", "Fairfield", "52556");
		Customer cust2 = new Customer("Laurence Lebihans",
				"12, rue des Bouchers", "Marseille", "13008");
		Customer cust3 = new Customer("Andy", "1000 Channing Ave", "Palo Alto",
				"94301");
		Customer cust4 = new Customer("Zeke", "212 Wilkshire Blvd", "Chicago",
				"57532");
		Customer cust5 = new Customer("Blauer Delikatessen", "Forsterstr. 57",
				"Mannheim", "68306");
		Customer cust6 = new Customer("Anna", "1000 N 4th", "Fairfield",
				"52557");
		List<Customer> list = Arrays.asList(cust1, cust2, cust3, cust4, cust5,
				cust6);

		//city equals Fairfield
		class MyPredict implements Predicate <Customer>
		{
			@Override
			public boolean test(Customer t)
			{
				return t.getCity().equals("Fairfield");
			}
		}
//		Predicate <Customer> p=new Predicate <Customer>()
//		{
//			
//			@Override
//			public boolean test(Customer t)
//			{
//				return t.getCity().equals("Fairfield");
//			}
//		};
		//Predicate<Customer> p = x -> x.getCity().equals("Fairfield");
		
		
		//get name as String
		class MyFunction implements Function <Customer, String>
		{
			@Override
			public String apply(Customer x)
			{
				return x.getName();
			}
		}
		
		//Function<Customer, String> f = x -> x.getName();
		
		// sort using name
		Comparator<Customer> c = Comparator.comparing(new MyFunction());
		
		class MyComparator implements Comparator<Customer>
		{
			@Override
			public int compare(Customer o1,Customer o2){
				return o1.getName().compareTo(o2.getName());
			}
		}
		
		// output form
		//BiFunction<String, String, String> d = (x, y) -> (x + " " + y);
		
		class MyBiFunction implements BinaryOperator <String>
		{
			@Override
			public String apply(String t, String u)
			{
				return t+" "+u;
			}
		}
		
		Optional<String> str1 = list.stream()
				.filter(new MyPredict())
				//.sorted(c)
				.sorted(new MyComparator())
				.map(new MyFunction())
				//.reduce((x, y) -> x + " " + y);
				.reduce(new MyBiFunction());
		
		if (str1.isPresent())
			System.out.println(str1);

	}

}
