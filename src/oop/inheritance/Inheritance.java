package oop.inheritance;
public class Inheritance {

	public static void main(String[] args) {
		B obj = new B();
		obj.i = 1;
		obj.j = 2;
		obj.display();
	}
}

class A {
	public int i;
	protected int j;
}

class B extends A {
	
	void display() {
		super.j = super.i + 10;
		System.out.println(super.i + " " + super.j);
	}
}