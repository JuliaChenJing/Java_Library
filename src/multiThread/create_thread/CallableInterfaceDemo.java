package multiThread.create_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

class CallableInterfaceDemo implements Callable<String> {

	private static final int THREAD_POOL_SIZE = 2;
	private AtomicInteger count = new AtomicInteger();

	// method where the thread execution takes place
	public String call() {
		return Thread.currentThread().getName() + " executing ..." + count.incrementAndGet(); // Consumer
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// create a pool of 2 threads
		ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

		CallableInterfaceDemo counter = new CallableInterfaceDemo();

		Future<String> future1 = executor.submit(counter); // Producer
		Future<String> future2 = executor.submit(counter); // Producer

		System.out.println(Thread.currentThread().getName() + " executing ...");

		// asynchronously get from the worker threads
		System.out.println(future1.get());
		System.out.println(future2.get());

	}
}