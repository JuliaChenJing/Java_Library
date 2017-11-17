package oop.interface_demo.shape.good;

import java.util.ArrayList;
import java.util.List;

public class App {
	List<ClosedCurve> objects = new ArrayList<>();
	public static void main(String[] args) {
		App app = new App();
		app.objects.add(new Rectangle(5,7));
		app.objects.add(new Rectangle(2,9));
		app.objects.add(new Circle(6));
		System.out.println(app.computeAveragePerimeter());
	}
	
	//OO (good) way of performing computation
	public double computeAveragePerimeter() {
		if(objects == null || objects.isEmpty()) return 0.0;
		double sum = 0.0;
		for(int i = 0; i < objects.size(); ++i) {
			sum += objects.get(i).computePerimeter();
		}
		return sum/objects.size();
	}

}
