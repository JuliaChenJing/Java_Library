package oop.compare.employee.sortWithComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {
	static enum SortMethod {BYNAME, BYSALARY};
	SortMethod method;
	
	public EmployeeSort(SortMethod method) {
		this.method = method;
	}
	public void sort(List<Employee> emps) {
		if(method == SortMethod.BYNAME) {
			Collections.sort(emps, new NameComparator());
		}
		else if(method == SortMethod.BYSALARY) {
			Collections.sort(emps, new SalaryComparator());
		}
	}
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeSort ei = new EmployeeSort(EmployeeSort.SortMethod.BYNAME);
		ei.sort(emps);
		System.out.println(emps);
		ei = new EmployeeSort(EmployeeSort.SortMethod.BYSALARY);
		ei.sort(emps);
		System.out.println(emps);
	}
}
