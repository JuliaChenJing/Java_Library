package functional_programming.class_test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployee {
	static enum SortMethod {BYNAME, BYSALARY};
	SortMethod method;
	
	public SortEmployee(SortMethod method) {
		this.method = method;
	}
	public void sort(List<Employee> emps) {
		if(method == SortMethod.BYNAME) {
			Collections.sort(emps, new EmployeeNameComparator());
		}
		else if(method == SortMethod.BYSALARY) {
			Collections.sort(emps, new EmployeeSalaryComparator());
		}
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		emps.add(new Employee("Joe", 60000));
		SortEmployee ei = new SortEmployee(SortEmployee.SortMethod.BYNAME);
		ei.sort(emps);
		System.out.println(emps);
		ei = new SortEmployee(SortEmployee.SortMethod.BYSALARY);
		ei.sort(emps);
		System.out.println(emps);
	}
}
