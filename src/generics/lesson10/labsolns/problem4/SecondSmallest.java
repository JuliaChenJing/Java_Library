package generics.lesson10.labsolns.problem4;
import java.util.*;
public class SecondSmallest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 2, 3, 6);
		System.out.println(secondSmallest2(list));
		
		List<Employee> list2 
		  = Arrays.asList(new Employee("joe", 10000), new Employee("tom", 200000));
		System.out.println(secondSmallest4(list2, new EmployeeNameComparator()));
	
	}
	
	public static Integer secondSmallest(List<Integer> list) {
		if(list == null || list.size() <= 1)
			return null;
		int smallest = list.get(0);
		int secondSmallest = list.get(1);
		if(smallest > secondSmallest) {
			int temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		for(int i = 2; i < list.size(); ++i) {
			int next = list.get(i);
			if(next < smallest) {
				secondSmallest = smallest;
				smallest = next;
			}
			else if(next < secondSmallest) {
				secondSmallest = next;
			}
			
		}
		return secondSmallest;
	}

	
	public static <T extends Comparable<T>> T secondSmallest2(List<T> list) {
		if(list == null || list.size() <= 1)
			return null;
		T smallest = list.get(0);
		T secondSmallest = list.get(1);
		if(smallest.compareTo(secondSmallest)>0) {
			T temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		for(int i = 2; i < list.size(); ++i) {
			T next = list.get(i);
			if(next.compareTo(smallest)<0) {
				secondSmallest = smallest;
				smallest = next;
			}
			else if(next.compareTo(secondSmallest)<0) {
				secondSmallest = next;
			}
			
		}
		return secondSmallest;
	}
	
	
	public static <T> T secondSmallest3(List<T> list, Comparator<T> comp) {
		if(list == null || list.size() <= 1)
			return null;
		T smallest = list.get(0);
		T secondSmallest = list.get(1);
		if(comp.compare(smallest, secondSmallest)>0) {
			T temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		for(int i = 2; i < list.size(); ++i) {
			T next = list.get(i);
			if(comp.compare(next,smallest)<0) {
				secondSmallest = smallest;
				smallest = next;
			}
			else if(comp.compare(next,secondSmallest)<0) {
				secondSmallest = next;
			}
			
		}
		return secondSmallest;
	}
	
	public static <T> T secondSmallest4(List<? extends T> list, Comparator<T> comp) {
		if(list == null || list.size() <= 1)
			return null;
		T smallest = list.get(0);
		T secondSmallest = list.get(1);
		if(comp.compare(smallest, secondSmallest)>0) {
			T temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		for(int i = 2; i < list.size(); ++i) {
			T next = list.get(i);
			if(comp.compare(next,smallest)<0) {
				secondSmallest = smallest;
				smallest = next;
			}
			else if(comp.compare(next,secondSmallest)<0) {
				secondSmallest = next;
			}
			
		}
		return secondSmallest;
	}
	
	public static <T> T secondSmallest5(List<? extends T> list, Comparator<? super T> comp) {
		if(list == null || list.size() <= 1)
			return null;
		T smallest = list.get(0);
		T secondSmallest = list.get(1);
		if(comp.compare(smallest, secondSmallest)>0) {
			T temp = smallest;
			smallest = secondSmallest;
			secondSmallest = temp;
		}
		for(int i = 2; i < list.size(); ++i) {
			T next = list.get(i);
			if(comp.compare(next,smallest)<0) {
				secondSmallest = smallest;
				smallest = next;
			}
			else if(comp.compare(next,secondSmallest)<0) {
				secondSmallest = next;
			}
			
		}
		return secondSmallest;
	}
}
