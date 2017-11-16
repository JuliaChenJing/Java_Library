package oop.interface_demo.shape.closedCurveFactory.noargument;


public class Rectangle implements ClosedCurve {

	Rectangle() {
	}
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}