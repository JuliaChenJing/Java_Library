package oop.shape.closedCurveFactory.good;

import java.util.ArrayList;
import java.util.List;

public class App {

	private static List<ClosedCurve> list = new ArrayList<ClosedCurve>();
	public static void main(String[] args) {
		Factory f = new Factory();

		ClosedCurve circle = f.getShape("CIRCLE");
		list.add(circle);
		ClosedCurve rec = f.getShape("RECTANGLE");
		list.add(rec);
		
		draw();
	}
	private static void draw() {

		for (ClosedCurve closedCurve : list) {
			closedCurve.draw();
		}
	}
}
