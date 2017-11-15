package multiThread.QueueMultiThread.ThreadSafe;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class MultiThreadedTest {	
	private static Executor exec 
	   = Executors.newCachedThreadPool();
	public static void main(String[] args) {	
		
		Queue q=new Queue();
		q.add("a");
		for(int i = 0; i < 50; ++i) {
			multipleCalls(q);
			q.display();
		}		
	}
	public static void multipleCalls(Queue q) {
		Runnable r = () -> {
			for(int i = 0; i < 10; ++i) {
				q.add(i);
			}
		};
//		for(int i = 0; i < 1000; ++i) {
//			new Thread(r).start();			
//		}
		
	
		for(int i = 0; i < 10; ++i) {
			exec.execute(r);		
		}
		try {
			Thread.sleep(100);
		} catch(InterruptedException e) {}
	}
}