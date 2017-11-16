package oop.association_Dependency.compositionDemo.apartmentRentalFee;

public class Apartment {

	RentalFee rent;
	
	Apartment(double r)
	{
		rent=new RentalFee(r);
	}
	
	public  double getRentalFee()
	{
		return rent.getFee();
	}
}
