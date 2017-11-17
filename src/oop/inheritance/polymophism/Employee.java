package oop.inheritance.polymophism;


class Employee {
	// constructor
	Employee(String aName, double aSalary) {
		name = aName;
		salary = aSalary;
	}

	// instance methods
	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	// instance fields
	private String name;
	private double salary;

}
