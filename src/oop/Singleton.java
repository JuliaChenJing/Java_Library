package oop;

public class Singleton {

	private static Singleton instance;
	private Singleton() {
		System.out.println("called once");
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

//	public static ClassA getInstance1() {
//		return  new ClassA();
//		
//	}	
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
	}

}
/*
called once
*/
