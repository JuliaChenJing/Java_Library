package oop.association_Dependency.compositionDemo.apartmentRentalFee;

public class App {

	public static void main(String [] args)
	{
		Apartment A1=new Apartment(300);
		Apartment A2=new Apartment(300);
		Apartment A3=new Apartment(300);
		
		Apartment [] a={A1,A2,A3};
		
		Apartment B1=new Apartment(500);
		Apartment B2=new Apartment(500);
		Apartment [] b={B1,B2};
		
		Building A=new Building(a,100);
		Building B=new Building(b,200);
		System.out.println("the landlord's monthly total profits are "+ (A.generatesProfit()+B.generatesProfit()));
		
	}
}
/*
the landlord’s monthly total profits are 1600.0
*/
