package oop.interface_demo.shape.closedCurveFactory.noargument;

public class Factory {

	public static ClosedCurve getCircle(){
		return new Circle();
	}
	
	public static ClosedCurve getRectangle(){
		return new Rectangle();
	}
	
}