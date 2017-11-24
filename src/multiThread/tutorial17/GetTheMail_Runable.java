package multiThread.tutorial17;
//You can use the Runnable interface instead of

//wasting your 1 class extension.

public class GetTheMail_Runable implements Runnable {

	// Stores the number of seconds before the code
	// will be executed
	private int startTime;

	// Constructor that sets the wait time for each
	// new Thread
	public GetTheMail_Runable(int startTime) {
		this.startTime = startTime;
	}

	// All of the code that the thread executes must be
	// in the run method, or be in a method called for
	// from inside of the run method
	public void run() {

		try {
			// Don't execute until 10 seconds has passed if
			// startTime equals 10

			/*
			 * wait() is from Object and sleep() is static method of Thread.
			 * 
			 * wait() releases the lock while sleep() doesn't release any lock
			 * while waiting.
			 * 
			 * The wait() is used for internal-thread communication while
			 * sleep() is used to introduce pause on execution, generally.
			 * 
			 * A wait can be "woken up" by another thread calling notify on the
			 * monitor which is being waited on whereas a sleep cannot. Also a
			 * wait (and notify) must happen in a block synchronized on the
			 * monitor object whereas sleep does not
			 */
			Thread.sleep(startTime * 1000);
		}

		catch (InterruptedException e) {
		}

		System.out.println("Checking for Mail--------");
	}

}
