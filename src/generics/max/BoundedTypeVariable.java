package generics.max;
import java.util.*;
public class BoundedTypeVariable {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3);
		ints.add(4);
		ints.add(-1);
		System.out.println(max0(ints));
		
		List<String> strs = new ArrayList<>();
		strs.add("Bob"); 
		strs.add("Steve");
		strs.add("Tom");
		System.out.println(max1(ints));
		System.out.println(max1(strs));
		
	}
	
	public static Integer max0(List<Integer> list) {
		Integer max = list.get(0);
		for(Integer i : list) {
			if(i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}

	public static <T extends Comparable> T max1(List<T> list) {
		T max = list.get(0);
		for(T i : list) {  
			if(i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}
	
	public static <T extends Comparable<T>> T max2(List<T> list) {
		T max = list.get(0);
		for(T i : list) {  
			if(i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}
	public static <T extends Comparable<? super T>> T max3(List<T> list) {
		T max = list.get(0);
		for(T i : list) {  
			if(i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}
	public static <T> T max4(List<T> list, Comparator<T> comp) {
		T max = list.get(0);
		for(T i : list) {  
			if(comp.compare(max, i) < 0) {
				max = i;
			}
		}
		return max;
	}
	public static <T> T max5(List<? extends T> list, Comparator<T> comp) {
		T max = list.get(0);
		for(T i : list) {  
			if(comp.compare(max, i) < 0) {
				max = i;
			}
		}
		return max;
	}
	public static <T> T max6(List<? extends T> list, Comparator<? super T> comp) {
		T max = list.get(0);
		for(T i : list) {  
			if(comp.compare(max, i) < 0) {
				max = i;
			}
		}
		return max;
	}
}
