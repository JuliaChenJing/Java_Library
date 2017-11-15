package oop.shape;
final class Circle implements ClosedCurve {
	final double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double computeArea() {
		return (Math.PI * radius * radius);
	}
}
