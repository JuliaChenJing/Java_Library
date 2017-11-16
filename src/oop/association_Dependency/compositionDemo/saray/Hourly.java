package oop.association_Dependency.compositionDemo.saray;

public class Hourly extends Employee {
	private double hourlyWage, hoursPerWeek;

	public Hourly(double hourlyWage, double hoursPerWeek) {
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}
	@Override
	public double calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		return hourlyWage * hoursPerWeek * 4;
	}
}






