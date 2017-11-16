package oop.interface_demo.shape.closedCurveFactory.noargument;

public class App {
	
	public static void main(String[] args) {
		
		ClosedCurve circle = Factory.getCircle();
		circle.draw();
		ClosedCurve rectangle = Factory.getRectangle();
		rectangle.draw();
	}

}
