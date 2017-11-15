package oop.shape.closedCurveFactory.best;

public class App {

	public static void main(String[] args) {
		Factory shapeFactory = new Factory();

		ClosedCurve shape1 = shapeFactory.getShape(Type.CIRCLE);
		shape1.draw();
		ClosedCurve shape2 = shapeFactory.getShape(Type.RECTANGLE);
		shape2.draw();

	}
}
