package generics.second_smallest;

public class EmployeeComparable implements Comparable<EmployeeComparable>{

	private String name;
	private int salary;
	public EmployeeComparable(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(EmployeeComparable o) {
		
		return this.getName().compareTo(o.getName());
	}
	@Override
	public String toString() {
		return "[name=" + name + ", salary=" + salary + "]";
	}
	
	
}
