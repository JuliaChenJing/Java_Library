package oop.shape;
final class Square implements ClosedCurve {
	final double side;

	Square(double side) {
		this.side = side;
	}

	public double computeArea() {
		return (side * side);
	}
}
