package oop.association_Dependency.compositionDemo.apartmentRentalFee;

public class Building {
	private Apartment []ap;
	private double buildingMaintenanceCost;

	public Building(Apartment[] ap, double buildingMaintenanceCost) {
	
		this.ap = ap;
		this.buildingMaintenanceCost = buildingMaintenanceCost;
	}
	
	public double generatesProfit()
	{
		double re=0;
		for(Apartment a:ap)
		{
			re+=a.getRentalFee();
		}
		re=re-buildingMaintenanceCost;
		return re;
	}
}
