package oop.interface_demo.shape.list;

final class Circle implements Shapes{
	private final double radius;
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
		
	}
	
	public double getRadius() {
		return radius;
	}

	public double computeArea(){
		return Math.PI * this.radius * this.radius ;
	}
}
