package oop.association_Dependency.compositionDemo.apartmentRentalFee;

public class RentalFee {
	
	private double fee;
	public RentalFee(double fee) {
		
		this.fee = fee;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
}
