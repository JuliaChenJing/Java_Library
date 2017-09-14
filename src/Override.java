public class Override {

	public static void main(String[] args) {
		
		Shape s = new Circle();
		s.print();//Circle
		
		System.out.println(s.count); //1  only methods are overridden ,not instance variable

		System.out.println(new Circle().count);//3
	
	}

}

class Shape {
	int count = 1;

	void print() {
		System.out.println("Shape");
	}
}

class Circle extends Shape {
	int count = 2;

	void print() {
		System.out.println("Circle");
	}
}
