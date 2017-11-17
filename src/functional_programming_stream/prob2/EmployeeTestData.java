package functional_programming_stream.prob2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTestData {
	private static List<Employee> list = new ArrayList<Employee>();
	static {
		list.add(new Employee("Joe", 100000, 1980));
		list.add(new Employee("Tim", 50000, 1982));
		list.add(new Employee("Mike", 90000, 1970));
		list.add(new Employee("Rick", 50000, 1955));
		list.add(new Employee("Andy", 60000, 1966));
		list.add(new Employee("Tim", 10000, 1995));
		list.add(new Employee("Tony", 130000, 1991));
		list.add(new Employee("Timmy", 150000, 1988));
		list.add(new Employee("Rich", 50000, 1980));
		list.add(new Employee("Andrew", 160000, 1970));
		list.add(new Employee("Ton", 150000, 1958));
		list.add(new Employee("Jose", 40000, 1970));
		list.add(new Employee("Timothy", 50000, 1996));
		list.add(new Employee("Ricardo", 50000, 1988));
		list.add(new Employee("Gemasio", 60000, 1971));
		list.add(new Employee("Mike", 80000, 1992));
	}
	public static List<Employee> getList() {
		return list;
	}
	
}
