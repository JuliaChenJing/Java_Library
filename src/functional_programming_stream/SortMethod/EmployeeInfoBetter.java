package functional_programming_stream.SortMethod;

import java.util.*;
import java.util.function.*;

public class EmployeeInfoBetter {
	static enum SortMethod {BYNAME, BYSALARY};
	Function<Employee, String> byName = e -> e.getName();
	Function<Employee, Integer> bySalary = e -> e.getSalary();
	Hashtable <SortMethod,Comparator <Employee>> hashTable=new Hashtable <SortMethod,Comparator <Employee>>();
	
	public void sort(List<Employee> emps, final SortMethod method) {
		
		hashTable.put(SortMethod.BYNAME,Comparator.comparing(byName).thenComparing(bySalary));
		hashTable.put(SortMethod.BYSALARY, Comparator.comparing(bySalary).thenComparing(byName));
		
		
//		if(method == SortMethod.BYNAME) {
//			Collections.sort(emps, Comparator.comparing(byName).thenComparing(bySalary));
//		} else {
//			Collections.sort(emps, Comparator.comparing(bySalary).thenComparing(byName));
//		}			
		
		Collections.sort(emps,hashTable.get(method));
		
	}
	

	
	
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Rick", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Tim", 10000));
		EmployeeInfoBetter ei = new EmployeeInfoBetter();
		ei.sort(emps, EmployeeInfoBetter.SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, EmployeeInfoBetter.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
