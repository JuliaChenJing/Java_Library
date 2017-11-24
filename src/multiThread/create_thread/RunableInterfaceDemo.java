package multiThread.create_thread;

import java.util.concurrent.atomic.AtomicInteger;

class RunableInterfaceDemo implements Runnable {

	AtomicInteger count = new AtomicInteger();

	// method where the thread execution will start
	public void run() {
		// logic to execute in a thread
		// e.g. performing a count task

		System.out.println(Thread.currentThread().getName() + " is executing..." + count.incrementAndGet());

	}

	// main thread, which is created as part of invoking “public static void main(String[ ] args) { …. }”
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " is executing...");
		RunableInterfaceDemo counter = new RunableInterfaceDemo();
		Thread t1 = new Thread(counter);
		Thread t2 = new Thread(counter);
		t1.start(); // start the thread. This calls the run() method.
		t2.start(); // start the thread. This calls the run() method.

	}
}
