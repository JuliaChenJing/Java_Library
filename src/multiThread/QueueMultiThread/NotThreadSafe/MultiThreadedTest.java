package multiThread.QueueMultiThread.NotThreadSafe;


public class MultiThreadedTest {	
	public static void main(String[] args) {	
		
		Queue q=new Queue();
		for(int i = 0; i < 10; ++i) {
			multipleCalls(q);
			q.display();
		}		
	}
	public static void multipleCalls(Queue q) {
		Runnable r = () -> {
			for(int i = 0; i < 5000; ++i) {
				q.add(i);
			}
		};
		for(int i = 0; i < 1000; ++i) {
			new Thread(r).start();			
		}
	}
}
