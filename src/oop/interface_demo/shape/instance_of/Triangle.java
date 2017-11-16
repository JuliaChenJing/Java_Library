package oop.interface_demo.shape.instance_of;
final class Triangle implements ClosedCurve {
	/* we require height <= base */
	final double base;
	final double height;
	/* we require side1 <= side2 <= side3 */
	final double side1, side2, side3;

	Triangle(double base, double height) {
		if (height <= base) {
			this.base = base;
			this.height = height;
		} else {
			this.base = height;
			this.height = base;
		}
		side1 = height;
		side2 = base;
		side3 = Math.sqrt(base * base + height * height);

	}

	public double computeArea() {
		return (0.5 * base * height);
	}
}
