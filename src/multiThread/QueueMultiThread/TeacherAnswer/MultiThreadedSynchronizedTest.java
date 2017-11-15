package multiThread.QueueMultiThread.TeacherAnswer;

public class MultiThreadedSynchronizedTest {	
	
	SynchronizedQueue q = new SynchronizedQueue();
	
	public static void main(String[] args) {	
		MultiThreadedSynchronizedTest mtt = new MultiThreadedSynchronizedTest();
		for(int i = 0; i < 10; ++i) {
			mtt.multipleCalls();
		}	
		System.out.println("Number of elements in the queue: " + mtt.q.countElements());
	}

	Runnable r = () -> {	
		q.add(0);
		q.add(0);
		q.remove();
	
	};	
	
	
	public void multipleCalls() {
		for(int i = 0; i < 500; ++i) {		
			new Thread(r).start();		
		}		
	}
}
