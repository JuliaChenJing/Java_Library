package compileOrder;
public class ClassA {
	static int superInt = superIntMethod();
	static int superIntMethod(){
		System.out.println("1.1-Initializing static super int");
		return 1;
	}
	static {
		System.out.println("1.2BLOCK Executing super static block");
	}
	private int superInstanceInt=superInstanceIntMethod();
	static int superInstanceIntMethod() {
		System.out.println("3- Initialzing superInstanceInt");
		return 3;
	}

	ClassA(){
		System.out.println("5- Running ClassA constructor");
	}
	{
		System.out.println("4-BLOCK Running super object initialization block");
	}
	public static void main(String[] args) {
		new TheSubClass();
	}
}
class TheSubClass extends ClassA {
	static int subInt = subIntMethod();
	static int subIntMethod(){
		System.out.println("2.1Initializing static sub int");
		return 2;
	}
	static {
		System.out.println("2.2-BLOCK Executing sub static block");
	}
	private int subInstanceInt = subInstanceIntMethod();
	static int subInstanceIntMethod() {
		System.out.println("7-Initialzing subInstanceInt");
		return 3;
	}
	TheSubClass(){
		System.out.println("8-Running TheSubClass constructor");
	}
	{
		System.out.println("6-BLOCK Running sub object initialization block");
	}

		
}


/*
1.1-Initializing static super int
1.2BLOCK Executing super static block
2.1Initializing static sub int
2.2-BLOCK Executing sub static block
3- Initialzing superInstanceInt
4-BLOCK Running super object initialization block
5- Running ClassA constructor
7-Initialzing subInstanceInt
6-BLOCK Running sub object initialization block
8-Running TheSubClass constructor
*/