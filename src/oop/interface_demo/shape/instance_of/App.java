package oop.interface_demo.shape.instance_of;
public class App {

	public static void main(String[] args) {

		Object[] objects = { new Triangle(5, 5), new Square(3), new Circle(3) };
		// compute areas
		for (Object o : objects) {
			if (o instanceof Triangle) {
				System.out.println("The name of the class is : " + o.getClass().getSimpleName());
				Triangle t = (Triangle) o;
				System.out.println("Area of Triangle : " + t.computeArea());
			}
			if (o instanceof Square) {
				System.out.println("The name of the class is : " + o.getClass().getName());
				Square s = (Square) o;

				System.out.println("Area of Rectangle : " + s.computeArea());
			}
			if (o instanceof Circle) {
				Circle c = (Circle) o;
				System.out.println("The name of the class is : " + o.getClass());
				System.out.println("Area of Circle : " + c.computeArea());
			}
		}
	}
}
/*
The name of the class is : Triangle
Area of Triangle : 12.5
The name of the class is : Square
Area of Rectangle : 9.0
The name of the class is : class Circle
Area of Circle : 28.274333882308138
*/
