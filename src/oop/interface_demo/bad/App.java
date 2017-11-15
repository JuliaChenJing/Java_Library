package oop.interface_demo.bad;

import java.util.ArrayList;
import java.util.List;

public class App {
	List<Object> objects = new ArrayList<Object>();
	public static void main(String[] args) {
		App dm = new App();
		dm.objects.add(new Rectangle(5,7));
		dm.objects.add(new Rectangle(2,9));
		dm.objects.add(new Circle(6));
		System.out.println(dm.computeAveragePerimeter());
	}
	
	//NON-OO (and bad) way of performing computation
	public double computeAveragePerimeter() {
		if(objects == null || objects.isEmpty()) return 0.0;
		double sum = 0.0;
		for(int i = 0; i < objects.size(); ++i) {
			if(objects.get(i) instanceof Circle) {
				sum += ((Circle)objects.get(i)).computeCircumference();
			}
			else if(objects.get(i) instanceof Rectangle) {
				sum += ((Rectangle)objects.get(i)).computePerimeter();
			}
		}
		return sum/objects.size();
	}

}
