package oop;

public class Singleton {

	private static Singleton instance;

	private Singleton() {
		System.out.println("called once");
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public static void main(String[] args) {
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
	}

}
/*
 * called once
 */
