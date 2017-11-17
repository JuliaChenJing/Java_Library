package functional_programming_stream.class_test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class App {
	
	public static void main(String[] args) {
		App e = new App();
		e.evaluator();
	}
	
	//O
	Function<String, String> upper1 = (String x) -> x.toUpperCase();
	Function<String, String> upper2 = String::toUpperCase; 
	//Method reference type: Class::instanceMethod
	

	//A
	Function<Employee, String> A = emp -> emp.getName();
	Function<Employee, String> A2 = Employee::getName;
	
	//B
	BiConsumer<Employee, String> setNameMethod = (emp, name) -> emp.setName(name);
	BiConsumer<Employee, String> setNameMethod2 = Employee::setName;
	
	//C
	BiFunction<String, String, Integer> comparing = (s1, s2) -> s1.compareTo(s2);
	BiFunction<String, String, Integer> comparing2 = String::compareTo;
	
	//D
	BiFunction<Integer, Integer, Double> D = (Integer x,Integer y) -> Math.pow(x,y);
	BiFunction<Integer, Integer, Double> D2 = Math::pow;
	
	//E
	Function<Apple, Double> findingWeight = a->a.getWeight();
	Function<Apple, Double> findingWeight2 = Apple::getWeight;


	//F
	Function<String, Integer> parseWala = (x) -> Integer.parseInt(x); 
	Function<String, Integer> parseWala2 = Integer::parseInt; 
	
	//G
	EmployeeNameComparator comp = new EmployeeNameComparator();
	BiFunction<Employee, Employee, Integer> comp2 = 
			(Employee e1, Employee e2) -> comp.compare(e1,e2);	



	void evaluator() {
		
		
		System.out.println("O:-------------------");
		System.out.println(upper1.apply("hello"));
    	System.out.println(upper2.apply("World"));

    	System.out.println("C:-----------");
		System.out.println("Comparison between two Strings=> "+comparing.apply("String", "String"));
		System.out.println("Comparison between two Strings=> "+comparing2.apply("String1", "String"));
		
    	
    	System.out.println("E:-----------");
		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple(10));
		apples.add(new Apple(20));
		apples.add(new Apple(30));
		
		for(Apple a: apples)
			System.out.println(findingWeight.apply(a));
		System.out.println(findingWeight2.apply(new Apple(3)));
		
		System.out.println("F:-----------");
		System.out.println(parseWala.apply("122"));
		System.out.println(parseWala2.apply("233"));
		
		
		System.out.println("G:-----------");
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("Bimal",1232));
		employeeList.add(new Employee("Julia",234));
		employeeList.add(new Employee("Aashutosh",234));
		employeeList.add(new Employee("Aask",234));
		
		employeeList.forEach(s->System.out.println(s));
	
		Collections.sort(employeeList,comp);
		System.out.println("The sorted list is:");
		employeeList.forEach(e->System.out.println(e));
		
		System.out.println(comp2.apply(new Employee("Bimal",1232), new Employee("Julia",234)));
		
	
		
		System.out.println("D:-----------");
		System.out.println(D.apply(2,3));
		System.out.println(D2.apply(2,3));
		
	}
	
}
	
	
