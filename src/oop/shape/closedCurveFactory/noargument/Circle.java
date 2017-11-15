package oop.shape.closedCurveFactory.noargument;


public class Circle implements ClosedCurve {

	Circle() {
	}
	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
