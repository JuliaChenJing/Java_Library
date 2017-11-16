package oop.interface_demo.shape.list;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		Circle c = new Circle(7);
		
		Rectangle r = new Rectangle(10, 20);
		
		Triangle t = new Triangle(5, 3.3);
		
		List<Shapes> s = Arrays.asList(c,r,t);
		
		double sum = 0.0;
		for(Shapes sh:s){
			sum += sh.computeArea();
		}
		System.out.format("Sum of Areas = %.2f",sum);
	}
}
