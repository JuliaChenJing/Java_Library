package oop.compare.employee.sortWithComparator;


public class Employee {
	String name;
	int salary;

	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("" + salary + ">");
		return sb.toString();

	}

	@Override
	public boolean equals(Object e) {
		if (e == null)
			return false;
		if (!(e instanceof Employee))
			return false;
		Employee emp = (Employee) e;
		boolean isEqual = this.name.equals(emp.name) && this.salary == emp.salary;
		return isEqual;
	}

}
