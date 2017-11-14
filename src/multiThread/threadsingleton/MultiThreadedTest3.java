package MultiThread.threadsingleton;

public class MultiThreadedTest3 {	
	public static void main(String[] args) {	
		for(int i = 0; i < 10; ++i) {
			multipleCalls();
			System.out.println(SynchronizedSingleton.getInstance());
			System.out.println("Num instances: " + SynchronizedSingleton.counter);
		}		
	}
	public static void multipleCalls() {
		Runnable r = () -> {
			for(int i = 0; i < 5000; ++i) {
				SynchronizedSingleton.getInstance();
			}
		};
		for(int i = 0; i < 1000; ++i) {
			new Thread(r).start();			
		}
		try {
			Thread.sleep(100);
		} catch(InterruptedException e) {}
	}
}
