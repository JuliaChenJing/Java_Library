package oop.compare.employee.comparator;

import java.util.Comparator;

public class CompareByName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		return e1.getName().compareTo(e2.getName());
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Joe", 1999, 10, 2);
		Employee e2 = new Employee("Joe", 2001, 9, 4);
		CompareByName comp = new CompareByName();
		System.out.println(e1.equals(e2));
		System.out.println(comp.compare(e1,e2));
	}

}
/*
false
0
*/
