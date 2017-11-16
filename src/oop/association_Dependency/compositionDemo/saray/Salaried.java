package oop.association_Dependency.compositionDemo.saray;

public class Salaried extends Employee{
	private double salary;
	
	public Salaried(double salary) {
		this.salary = salary;
	}
	
	@Override
	public double calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		return salary;
	}
}
