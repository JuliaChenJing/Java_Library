package multiThread.tuturial18;
//https://www.youtube.com/watch?v=G2Xd5avyk_0

/*In the last tutorial I coordinated threads using

a timing method. Here I show you how to execute code based
on a predefined time schedule and much more

Used to schedule when certain events should be triggered
*/

import java.util.concurrent.ScheduledThreadPoolExecutor;

//Used to tell Java what unit of time I want to use
import static java.util.concurrent.TimeUnit.*;

public class Application18 {

	/*
	 * In this Java Video Tutorial, I continue to teach you about Java Threads.
	 * If you missed the last part, watch it first here last Java Tutorial.
	 * 
	 * Today I cover how to lock down methods, synchronized, thread pools,
	 * scheduleAtFixedRate and numerous other Java Thread methods.
	 * 
	 * Use the code that follows the video to make it easier to follow this
	 * tutorial. It is heavily commented and will help you.
	 */

	public static void main(String[] args) {

		addThreadsToPool();

	}

	public static void addThreadsToPool() {

		// Allows you to schedule code execution at some time in the future
		// You can also have code execute repetitively based on a time period
		// It must be big enough to hold all potential Threads

		/*
		 * public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long
		 * initialDelay, long period, TimeUnit unit)
		 */
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);

		// Adds a Thread to the pool. Tells that thread to start executing
		// after 0 seconds (immediately) and then execute every 2 seconds

		eventPool.scheduleAtFixedRate(new CheckSystemTime_Runable(), 0, 2, SECONDS);

		eventPool.scheduleAtFixedRate(new PerformSystemCheck_Runable("Mail"), 5, 5, SECONDS);

		eventPool.scheduleAtFixedRate(new PerformSystemCheck_Runable("Calendar"), 10, 10, SECONDS);

		// Thread.activeCount returns the number of threads running

		System.out.println("Number of Threads: " + Thread.activeCount());

		// Quiz: Why does it say there are 4 threads when we expect 3?

		// Create an array of threads with enough spaces for all active threads

		Thread[] listOfThreads = new Thread[Thread.activeCount()];

		// enumerate fills the Thread array with all active threads

		Thread.enumerate(listOfThreads);

		// Cycle through all the active threads and print out their names

		for (Thread i : listOfThreads) {
			System.out.println(i.getName());
		}

		// Get priority of all the threads (Priority is equal to the thread
		// that created the new thread. Top priority is 10, lowest priority is 1

		for (Thread i : listOfThreads) {
			System.out.println(i.getPriority());
		}

		// threadName.setPriority can be used to set the priority

		// This allows the above threads to run for approximately 20 seconds

		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
		}

		// Shuts down all threads in the pool

		// eventPool.shutdown();

	}

}