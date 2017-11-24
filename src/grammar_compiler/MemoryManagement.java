package grammar_compiler;

public class MemoryManagement {

	/*
	 * Stack: is where local variables both primitives like int, float, etc &
	 * references to objects in the heap and method parameters are stored as
	 * shown in the above diagram.
	 * 
	 * Heap: is where objects are stored. For example, an instance of “Person”
	 * with name=”John” and age=25. 
	 * Strings will be stored in String Pool within the heap.
	 */

	// instance variables
	private String name;
	private int age;

	// constructor
	public MemoryManagement(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		MemoryManagement p1 = new MemoryManagement("John", 25); // "p1" is
																// object
																// reference in
																// stack
																// pointing to
																// the object in
																// the heap
		String greeting = "Hello"; // "greeting" is a reference in stack
									// pointing to an Object in Heap String pool
		p1.addOneAndPrint(greeting);
	}

	public void addOneAndPrint(String param) {
		int valToAdd = 1; // local primitive variable in stack
		this.age = this.age + valToAdd; // instance variable in heap is mutated
										// to 26 via "param" reference in stack
		System.out.println(param + "! " + this); // calls toString() method
	}

	@Override
	public String toString() {
		return name + " you are now " + age;
	}
}
