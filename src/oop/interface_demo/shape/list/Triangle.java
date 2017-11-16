package oop.interface_demo.shape.list;

final class Triangle implements Shapes{
	private final double base, height;
	public Triangle(double base, double height) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public double computeArea(){
		return this.base * this.height /2 ;
	}
}
