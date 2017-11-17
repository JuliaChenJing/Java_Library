package generics.mergeIt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Utility {

//	public static <T> T secondSmallest(List<? extends T> list, Comparator<? super T> comp) {
//	//	T max = list.get(0);
//		list.sort(comp);
//		return list.get(1);
//	}
//	
//	public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
//		
//		Collections.sort(list);
//		return list.get(1);
//	}
	
	public static  < T> List < ? extends T> merge(List< T> list, List<? extends T>  list2,Comparator<? super T> comp) {
		list.addAll(list2);
		list.sort(comp);
		return list;
	}
	

//	public static <T extends Comparable<? super T>> List<T>  merge(List<T> list,List<T> list2) {
//		
//		list.addAll(list2);
//		Collections.sort(list);
//		return list;
//	}
	
public static <T extends Comparable<? super T>> List< T>  merge(List<T> list,List< T> list2) {
		
		list.addAll(list2);
		Collections.sort(list);
		return list;
	}
	
	


	public static void main(String [] args)
	{
		System.out.println("Integer test:");
		List <Integer> l1=new ArrayList <Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(5);
		List<Integer> l1_1=new ArrayList <Integer>();
	
		l1_1.add(2);
	
		System.out.println(merge(l1,l1_1));
		
		System.out.println("String test:");
		List <String> l2=new ArrayList <String>();
		l2.add("apple");
		l2.add("banana");
		l2.add("orange");
		List <String> l2_1=new ArrayList <String>();
		l2.add("strawberry");
		l2.add("watermelon");
	
		System.out.println(merge(l2,l2_1));
		
		
		System.out.println("Double test:");
		List <Double> l3=new ArrayList <Double>();
		l3.add(1.1);
		l3.add(2.2);
		l3.add(3.2);
		List <Double> l3_1=new ArrayList <Double>();
		l3_1.add(1.4);
		System.out.println(merge(l3,l3_1));
		
		System.out.println("Manager test:");
		List<Manager> managerList = new ArrayList<Manager>() {
			{
				add(new Manager("anne", 10000, 2));
				add(new Manager("michelle", 10000, 5));
				add(new Manager("zoe", 10000, 3));
			}
		};
		Comparator<Employee> comp = new EmployeeNameComparator();
		System.out.println(merge(managerList,managerList, comp));
		
		System.out.println("Employee test:");
		List<EmployeeComparable> employeeList = new ArrayList<EmployeeComparable>() {
			{
				add(new EmployeeComparable("anne", 10000));
				add(new EmployeeComparable("michelle", 10000));
				add(new EmployeeComparable("zoe", 10000));
			}
		};
	
		System.out.println(merge(employeeList,employeeList));
		
		System.out.println("LocalDate test:");
		List<LocalDate> dates = new ArrayList<>();
		dates.add(LocalDate.of(2011, 1, 1));
		dates.add(LocalDate.of(2014, 2, 5));
        List <LocalDate> mergeResult= merge(dates,dates); 
		System.out.println(mergeResult);
		
		List  <String> strArray=new ArrayList();
		strArray.add("A");
		strArray.add("XYZ");
		strArray.add("AXTU");
		
		List <Integer>intArray=new ArrayList();
		intArray.add(2);
		intArray.add(4);
		intArray.add(6);
		
		List <Double> doubleArray=new ArrayList();
		doubleArray.add(2.2);
		doubleArray.add(4.4);
		doubleArray.add(6.4);
		Comparator  comp2 = new NumComparator();
		//Comparator<Employee> comp = new EmployeeNameComparator();
		//merge(intArray,doubleArray,comp2);
	}


	
}
