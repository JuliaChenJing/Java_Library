package oop.association_Dependency.compositionDemo.saray;
import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order o1 = new Order(1, 2000);
		Order o2 = new Order(2, 2500);
		Order o3 = new Order(3, 3000);
		LocalDate ld=LocalDate.now();
		ld=LocalDate.of(2016, 9, 23);
		o1.setOrderDate(ld);
		
		ld=LocalDate.of(2016, 9, 13);
		o2.setOrderDate(ld);
		
		ld=LocalDate.of(2016, 3, 23);
		o3.setOrderDate(ld);
		
		
		Order[] o = {o1,o2,o3};
		
		Employee bimal = new Commissioned(10, 3000, o);
		System.out.println("Commissioned Employee:Bimal");
		bimal.calcCompensation(10, 2016);
		System.out.println();
		Employee julia = new Salaried(3000);
		System.out.println("Salaried Employee:Julia");
		julia.calcCompensation(10, 2016);
		System.out.println();
		
		Employee ashutosh = new Hourly(30, 35);
		System.out.println("Hourly Employee:Ashutosh");
		ashutosh.calcCompensation(10, 2016);
		
	}

}
