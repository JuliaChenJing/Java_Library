package functional_programming_stream.prob2;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.*;


public class LambdaLibrary {
	public final static String IMPLEMENT = "implement!";
	
	//sample query
	public final static TriFunction<List<Employee>, Integer, Integer, List<Employee>> SAMPLE
	   = (list, namelength, year) -> list.stream()
	                                     .filter(e -> e.getName().length() > namelength)
	                                     .filter(e -> e.getYearOfBirth() > year)
	                                     .collect(Collectors.toList());

	   public final static Function<int [], Stream <Integer>> QUESTION1_WRONG
	   = (arraylist) -> IntStream.of(arraylist)                                 
	   .filter(e -> e%2==0) 
	   .boxed();
	   
	   public final static Function<int [], int []> QUESTION1
	   = (arraylist) -> IntStream.of(arraylist)                                 
	   .filter(e -> e%2==0) 
	   .toArray();
	   
	   public final static Function<int [],  Integer> QUESTION2
	   = (arraylist) -> IntStream.of(arraylist)
	                                     .map(x->x*x)
	                                    .reduce(0, (x,y)->(x+y));
	                                    
	   public final static Function<int [],  Integer> QUESTION2_2
	   = (arraylist) -> IntStream.of(arraylist)
	                                    .reduce(0, (x,y)->(x+y*y));
	   
		public static final Function <List<Transaction>, List<Transaction>>  QUESTION3_WRONG 
		=list->list.stream()
			.filter(x->x.getYear()==2011)
			.sorted(  (x, y) -> x.getValue()-(y.getValue()))
					.collect(Collectors.toList());
		
		public static final BiFunction <List<Transaction>,Integer, List<Transaction>>  QUESTION3 
		=(list,year)->list.stream()
			.filter(x->x.getYear()==year)
			.sorted(  (x, y) -> x.getValue()-(y.getValue()))
					.collect(Collectors.toList());
		
		
			public static final Function <List<Transaction>, List<Trader>> QUESTION4_WRONG = 
					list->
			 list.stream()
			 	.map(x->x.getTrader())
				.filter(x->x.getCity().equals("Cambridge"))
				.sorted((x, y) -> x.getName().compareTo(y.getName()))
						.collect(Collectors.toList());
			 
			 public static final BiFunction <List<Transaction>, String, List<Trader>> QUESTION4 = 
						(list,str)->
				 list.stream()
				 	.map(x->x.getTrader())
					.filter(x->x.getCity().equals(str))
					.sorted((x, y) -> x.getName().compareTo(y.getName()))
							.collect(Collectors.toList());
				
				public static final Function <List<Employee>, List<Pair> > QUESTION5_WRONG = list->
				 list.stream()
					.filter(x->x.getSalary()>55000)
					.filter(x->x.getSalary()<120000)
					//filter(x->x.getLastName().charAt(0)<='R').
					//map(x->x.getFirstName()+" "+x.getLastName()).map(s->s.toUpperCase()).
					.sorted((x, y) -> x.getName().compareTo(y.getName()))
					.sorted((x, y) -> x.getSalary()-y.getSalary()  )
						.map(x->new Pair(x.getName(),x.getSalary())    )
							.collect(Collectors.toList());

					
					public static final TriFunction <List<Employee>,Integer,Integer, List<Pair> > QUESTION5 = (list, num1,num2)->
					 list.stream()
						.filter(x->x.getSalary()>num1)
						.filter(x->x.getSalary()<num2)
						//filter(x->x.getLastName().charAt(0)<='R').
						//map(x->x.getFirstName()+" "+x.getLastName()).map(s->s.toUpperCase()).
						.sorted((x, y) -> x.getName().compareTo(y.getName()))
						.sorted((x, y) -> x.getSalary()-y.getSalary()  )
							.map(x->new Pair(x.getName(),x.getSalary())    )
								.collect(Collectors.toList());

	   
	   

	   
}
