package oop.compare;



public class ObjectEquals {
	public static void main(String[] args) {
		Laptop ob1 = new Laptop("Apple", "Red");
		Laptop ob2 = new Laptop("Apple", "Red");
		Laptop ob3 = new Laptop("Apple", "White");
		Laptop ob4 = ob1;
		if (ob1.equals(ob2))
			System.out.println("Ob1 and Ob2 are Equals --> True");
		else
			System.out.println("Ob1 and Ob2 are not Equal --> False");
		if (ob1.equals(ob3))
			System.out.println("Ob1 and Ob3 are Equals --> True");
		else
			System.out.println("Ob1 and Ob3 are not Equal --> False");
		System.out.println(ob1);
		System.out.println("Hash code Obj1 : " + ob1.hashCode());
		System.out.println(ob2);
		System.out.println("Hash code Obj2 : " + ob2.hashCode());
		System.out.println(ob3);
		System.out.println("Hash code Obj3 : " + ob3.hashCode());
		System.out.println(ob4);
		System.out.println("Hash code Obj4 : " + ob4.hashCode());
	}

}

class Laptop {
	private String name = null;
	private String color = null;

	public Laptop(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		// Are they same?
		if (this == obj)
			return true;
		// Is other object a null reference?
		if (obj == null)
			return false;
		// do they belongs to the same class?
		if (this.getClass() != obj.getClass())
			return false;
		// get the reference of obj in a Laptop variable type
		Laptop lp = (Laptop) obj;
		// Do they have same name and same color
		if (lp.name.equals(this.name) && lp.color.equals(this.color))
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		// User defined formula
		hash = 11 * hash + color.hashCode() * name.hashCode();
		return hash;
	}

	public String toString() {
		String info = "Name = " + name + " Color = " + color;
		return info;
	}
}

