package generics.lesson10.lecture.generics.count;

import java.util.stream.Stream;

public class CountStringOccurrences {
	public static int countOccurrences(String[] arr, String target) {
		int count = 0;
		if (target == null) {
			for (String item : arr)
				if (item == null)
					count++;
		} else {
			for (String item : arr)
				if (target.equals(item))
					count++;
		}
		return count;
	}
	public static <T> int countOccurrencesGeneric(T[] arr, T target) {
		int count = 0;
		if (target == null) {
			for (T item : arr)
				if (item == null)
					count++;
		} else {
			for (T item : arr)
				if (target.equals(item))
					count++;
		}
		return count;
	}
	public static int countOccurrences1(String[] arr, String target) {
		return (int)Stream.of(arr).filter(x->{
			if(target == null)
				return x == target;
			else
				return target.equals(x);
		}).count();
		}
	}
	
	

