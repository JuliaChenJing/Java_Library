package functional_programming_stream.prob2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class App {
	public static void main(String[] args) {
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();
		//Print all Employee records for which name has length > 5 and birth year is > 1970
		System.out.println(LambdaLibrary.SAMPLE.apply(sampleData, 5, 1970));
		
		System.out.println("\nQuery 1");
		int[] testItem1 = {-351, 2342, 46, 17, 14, 4002, 12};
		//Extract subarray of even integers from an array of integers
		System.out.println(LambdaLibrary.QUESTION1_WRONG.apply(testItem1).collect(Collectors.toList()));
		System.out.println(Arrays.toString(LambdaLibrary.QUESTION1.apply(testItem1)));
		
		System.out.println("\nQuery 2");
		int[] testItem2 = {-1, -3, 5, 11, 213};
		//Compute sum of squares of an input array of integers
		System.out.println(LambdaLibrary.QUESTION2.apply(testItem2));
		System.out.println(LambdaLibrary.QUESTION2_2.apply(testItem2));
		
		System.out.println("\nQuery 3");
		//Find all transactions from year 2011 and sort them by value (small to high).
		List<Transaction> testItem3 = TraderTransactTestData.getTransactions();
		System.out.println(LambdaLibrary.QUESTION3_WRONG.apply(testItem3));
		

		System.out.println(LambdaLibrary.QUESTION3.apply(testItem3,2011));
	        
		System.out.println("\nQuery 4");
		// Find all traders from Cambridge and sort them by name.
		List<Transaction> testItem4 = TraderTransactTestData.getTransactions();  
		System.out.println(LambdaLibrary.QUESTION4_WRONG.apply(testItem4));
		String str="Cambridge";
		System.out.println(LambdaLibrary.QUESTION4.apply(testItem4,str));
	
		
		System.out.println("\nQuery 5");
		List<Employee> testItem5 = EmployeeTestData.getList();
		//Find all name/salary pairs extracted from a list of Employees
		//for which salary > 55000 and less than 120000, in ascending
		//order of name, then descending order of salary
		System.out.println(LambdaLibrary.QUESTION5_WRONG.apply(testItem5));
		System.out.println(LambdaLibrary.QUESTION5.apply(testItem5,55000,120000));
                
	}
}
