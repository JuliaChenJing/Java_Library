package multiThread.tutorial17;

//https://www.youtube.com/watch?v=F-CkaU8aQZI
public class Application17 {

	/*
	 * In this Java Video Tutorial I cover how to use Java threads.
	 * 
	 * A thread is just a block of code that is expected to execute while other
	 * blocks of code execute. That’s it. When you want to execute more than one
	 * block of code at a time you have to alert Java.
	 * 
	 * In this video I show you how to alert the interpreter. Part 1 of this
	 * series is here Java Video Tutorial. Heavily commented code follows the
	 * video.
	 */
	public static void main(String[] args) {

		// Create a new Thread that executes the code in getTimeThread20

		Thread getTimeThread = new CheckSystemTime_Thread();

		// Create a new Thread created using the Runnable interface
		// Execute the code in run after 10 seconds

		Runnable getMail = new GetTheMail_Runable(10);//wait 10 seconds to check the mail

		Runnable getMailAgain = new GetTheMail_Runable(20);//wait 20 seconds to check the mail

		// Call for the code in the method run to execute

		getTimeThread.start();

		new Thread(getMail).start();//just run once
		new Thread(getMailAgain).start();//just run once

	}
}
