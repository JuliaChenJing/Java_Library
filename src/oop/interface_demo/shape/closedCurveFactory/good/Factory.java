package oop.interface_demo.shape.closedCurveFactory.good;

public class Factory {

	// use getShape method to get object of type shape
	public ClosedCurve getShape(String type) {
		
		if ("CIRCLE".equalsIgnoreCase(type)) {
			return new Circle();

		} else if ("RECTANGLE".equalsIgnoreCase(type)) {
			return new Rectangle();

		}
		throw new IllegalArgumentException("no such type found!");
	}
}