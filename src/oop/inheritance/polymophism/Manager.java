package oop.inheritance.polymophism;

class Manager extends Employee {
	private double bonus;
	public Manager(String name, double salary) {
		super(name, salary);
		bonus = 0;
	}

	@Override
	public double getSalary() {
		// no direct access to private variables of superclass
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}

	public void setBonus(double b) {
		bonus = b;
	}

	
}
