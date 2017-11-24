package multiThread.threadsingleton;

public class SynchronizedSingleton {
	private static SynchronizedSingleton instance;
	public static int counter = 0;
	private SynchronizedSingleton() {
		incrementCounter();
	}
	synchronized public static SynchronizedSingleton getInstance() { 
		if(instance == null) {
			instance = new SynchronizedSingleton();			
		}
		return instance;
	}
	private static void incrementCounter() {
		counter++;
	}
	@Override
	public String toString() {
		return "SynchronizedSingleton [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}

