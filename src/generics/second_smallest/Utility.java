package generics.second_smallest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Utility {

	public static <T> T secondSmallest(List<? extends T> list, Comparator<? super T> comp) {
		list.sort(comp);
		return list.get(1);
	}
	
	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
		
		Collections.sort(list);
		return list.get(1);
	}
	


	
	public static void main(String [] args)
	{
		System.out.println("Integer test:");
		List <Integer> l1=new ArrayList <Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
	
		System.out.println(secondSmallest(l1));
		
		System.out.println("String test:");
		List <String> l2=new ArrayList <String>();
		l2.add("apple");
		l2.add("banana");
		l2.add("orange");
	
		System.out.println(secondSmallest(l2));
		
		
		System.out.println("Double test:");
		List <Double> l3=new ArrayList <Double>();
		l3.add(1.1);
		l3.add(2.2);
		l3.add(3.2);
	
		System.out.println(secondSmallest(l3));
		
		System.out.println("Manager test:");
		List<Manager> managerList = new ArrayList<Manager>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(new Manager("anne", 10000, 2));
				add(new Manager("michelle", 10000, 5));
				add(new Manager("zoe", 10000, 3));
			}
		};
		Comparator<Employee> comp = new EmployeeNameComparator();
		System.out.println(secondSmallest(managerList, comp));
		
		System.out.println("Employee test:");
		List<EmployeeComparable> employeeList = new ArrayList<EmployeeComparable>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(new EmployeeComparable("anne", 10000));
				add(new EmployeeComparable("michelle", 10000));
				add(new EmployeeComparable("zoe", 10000));
			}
		};
		//Comparator<Employee> comp = new EmployeeNameComparator();
		System.out.println(secondSmallest(employeeList));
		
		System.out.println("LocalDate test:");
		List<LocalDate> dates = new ArrayList<>();
		dates.add(LocalDate.of(2011, 1, 1));
		dates.add(LocalDate.of(2014, 2, 5));
        LocalDate secondOldest= secondSmallest(dates); 
		System.out.println(secondOldest);
	}

}
