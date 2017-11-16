package oop.association_Dependency.compositionDemo.saray;

public abstract class Employee {
	private int empId;

	public void print() {
	}

	public Paycheck calcCompensation(int month, int year) {
		Paycheck p = new Paycheck(calcGrossPay(month, year));
		p.print();
		return p;
	}

	abstract public double calcGrossPay(int month, int year);
}
