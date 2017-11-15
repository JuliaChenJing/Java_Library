package oop.associationAndDependency.compositionDemo;

public class PersonWithJob  {
	
	private Person person;
	private double salary;
	public String getName() {
		return person.getName();
	}
	public double getSalary() {
		return salary;
	}
	PersonWithJob(String n, double s) {
		person = new Person(n);
		salary = s;
	}
	


}
