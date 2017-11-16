package oop.interface_demo.shape.closedCurveFactory.better;

public class Factory {

	// use getShape method to get object of type shape
	public ClosedCurve getShape(Type type) {
		
		if (type == Type.CIRCLE) {
			return new Circle();

		} else if (type == Type.RECTANGLE) {
			return new Rectangle();

		}
		throw new IllegalArgumentException("no such type found!");
	}
}