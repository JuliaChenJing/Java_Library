package generics.max;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Max {

	public static Integer max(List<Integer> list) {
		Integer max = list.get(0);
		for (Integer i : list) {
			if (i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}

	public static <T extends Comparable<T>> T max1(List<T> list) {
		T max = list.get(0);
		for (T i : list) {
			if (i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}

	public static <T extends Comparable<T>> T max2(List<T> list) {
		T max = list.get(0);
		for (T i : list) {
			if (i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}

	/*
	 * this version will accept List<LocalDate> since LocalDate is a subtype of
	 * Comparable<ChronoLocalDate> and ChronoLocalDate is a supertype of
	 * LocalDate
	 */
	public static <T extends Comparable<? super T>> T max3(List<T> list) {
		T max = list.get(0);
		for (T i : list) {
			if (i.compareTo(max) > 0) {
				max = i;
			}
		}
		return max;
	}

	/*
	 * this version uses a comparator to compare since not every class
	 * implements Comparable, eg. Employee class
	 */
	public static <T> T max4(List<T> list, Comparator<T> comp) {
		T max = list.get(0);
		for (T i : list) {
			if (comp.compare(max, i) < 0) {
				max = i;
			}
		}
		return max;
	}

	/*
	 * Given a Comparator<Employee>, we can find a max for List<Manager> by
	 * using the comparing strategy of Comparator<Employee>
	 */
	public static <T> T max5(List<? extends T> list, Comparator<T> comp) {
		T max = list.get(0);
		for (T i : list) {
			if (comp.compare(max, i) < 0) {
				max = i;
			}
		}
		return max;
	}

	/*
	 * Given a List<Manager>, we can use a Comparator<Employee> for comparing if
	 * we only want to compare manager objects using employee properties
	 */
	public static <T> T max6(List<? extends T> list, Comparator<? super T> comp) {
		T max = list.get(0);
		for (T i : list) {
			if (comp.compare(max, i) < 0) {
				max = i;
			}
		}
		return max;
	}

	public static void main(String[] args) {

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
//		 Max.max4(managerList, comp);
		Max.max5(managerList, comp);
		Max.max6(managerList, comp);
	}

}
