package oop.association_Dependency.compositionDemo.saray;

public final class Paycheck {
	private final double grosspay;
	private final double fica = 0.023, state = 0.05, local = 0.01, medicare = 0.03,  SSN = 0.075;
	
	public Paycheck(double grosspay){
		this.grosspay = grosspay;	
	}

	public double getGrosspay() {
		return grosspay;
	}

	public void print(){
		System.out.println("The GrossPay is "+this.grosspay+" and Net Pay is "+this.getNetPay());
	}
	public double getNetPay(){
		return grosspay-((fica + state + local + medicare + SSN) * grosspay);
		
	}
}
