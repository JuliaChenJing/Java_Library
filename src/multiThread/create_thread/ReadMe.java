package multiThread.create_thread;

//https://www.java-success.com/java-beginner-multithreading-interview-questions-and-answers/
public class ReadMe {

	/*
	 * Explain different ways of creating a thread? A4. In addition to the JVM
	 * created threads, application developers can create new threads in Java.
	 * Threads can be created in a number of different ways.
	 * 
	 * Creating a Thread in Java Creating a Thread in Java
	 * 
	 * 1) Extending the java.lang.Thread class.
	 * 
	 * 2) Implementing the java.lang.Runnable interface.
	 * 
	 * 3) Implementing the java.util.concurrent. Callable interface with the
	 * java.util.concurrent.Executor framework to pool the threads. The
	 * java.util.concurrent package was added in Java 5. [ 7 basic Java Executor
	 * framework Interview Q&As with Future & CompletableFuture ]
	 * 
	 * 4) Using the Fork/Join Pool. Java 7 fork and join tutorial with a diagram
	 * and an example.
	 * 
	 * 5) The actor model, which is also known as Reactive Programming using
	 * frameworks like Akka. Simple Akka tutorial in Java step by step
	 */

	/*
	 * Q5. Which approach would you favor and why? A5. Favor Callable interface
	 * with the Executor framework for thread pooling.
	 * 
	 * 1) The thread pool is more efficient. Even though the threads are
	 * light-weighted than creating a process, creating them utilizes a lot of
	 * resources. Also, creating a new thread for each task will consume more
	 * stack memory as each thread will have its own stack and also the CPU will
	 * spend more time in context switching. Creating a lot many threads with no
	 * bounds to the maximum threshold can cause application to run out of heap
	 * memory. So, creating a Thread Pool is a better solution as a finite
	 * number of threads can be pooled and reused. The runnable or callable
	 * tasks will be placed in a queue, and the finite number of threads in the
	 * pool will take turns to process the tasks in the queue.
	 * 
	 * 2) The Runnable or Callable interface is preferred over extending the
	 * Thread class, as it does not require your object to inherit a thread
	 * because when you need multiple inheritance, only interfaces can help you.
	 * Java class can extend only one class, but can implement many interfaces.
	 * 
	 * 3) The Runnable interface’s void run( ) method has no way of returning
	 * any result back to the main thread. The executor framework introduced the
	 * Callable interface that returns a value from its call( ) method. This
	 * means the asynchronous task will be able to return a value once it is
	 * done executing.
	 */

	/*
	 * Q8. Why is locking of a method or block of code for thread safety is
	 * called “synchronized” and not “lock” or “locked”? A8. When a method or
	 * block of code is locked with the reserved “synchronized” key word in
	 * Java, the memory (i.e. heap) where the shared data is kept is
	 * synchronized. This means,
	 * 
	 * When a synchronized block or method is entered after the lock has been
	 * acquired by a thread, it first reads (i.e. synchronizes) any changes to
	 * the locked object from the main heap memory to ensure that the thread
	 * that has the lock has the current info before start executing.
	 * 
	 * After the synchronized block has completed and the thread is ready to
	 * relinquish the lock, all the changes that were made to the object that
	 * was locked is written or flushed back (i.e. synchronized) to the main
	 * heap memory so that the other threads that acquire the lock next has the
	 * current info.
	 * 
	 * This is why it is called “synchronized” and not “locked”. This is also
	 * the reason why the immutable objects are inherently thread-safe and does
	 * not require any synchronization. Once created, the immutable objects
	 * cannot be modified.
	 */

}
