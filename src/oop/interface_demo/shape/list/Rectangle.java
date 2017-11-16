package oop.interface_demo.shape.list;

final class Rectangle implements Shapes {
	private final double width, length;
	public Rectangle(double width, double length) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.length = length;
		
	}
	
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public double computeArea(){
		return this.width * this.length ;
	}
}
