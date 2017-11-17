package generics.max;

import java.time.LocalDate;
import java.util.*;

public class MaxAndCalender {
	
	//error because LocalDate does not implement Comparable<LocalDate>
	//
	public static void main(String[] args) {
		List<LocalDate> dates = new ArrayList<>();
		dates.add(LocalDate.of(2011, 1, 1));
		dates.add(LocalDate.of(2014, 2, 5));
//		LocalDate mostRecent = max2(dates); //compiler error
		LocalDate mostRecent = Max.max3(dates); 
		System.out.println(mostRecent);
	}
	
	
}
