package oop.interface_demo.shape.closedCurveFactory.better;

public class Rectangle implements ClosedCurve {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}