package oop.association_Dependency.compositionDemo.saray;
import java.time.LocalDate;


public class Commissioned extends Employee{
	private double commission, baseSalary;
	private Order[] od;
	
	
	public Commissioned(double commission, double baseSalary, Order[] o) {
		this.commission = commission;
		this.baseSalary = baseSalary;
		od = o;
		
	}

	@Override
	public double calcGrossPay(int month, int year) {
		// TODO Auto-generated method stub
		double totalCommission = 0.0;
		LocalDate test=LocalDate.of(year, month, 1);
		
		for(Order o: od){
			
			if(o.getOrderDate().getMonth().equals((test.minusMonths(1)).getMonth()))
				
			totalCommission += ((commission/100) * o.getOrderAmount());
		}
		return baseSalary + totalCommission ;
	}
	
	
}