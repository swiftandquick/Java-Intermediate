package s15p171_Step_2;

public class App {

	static public int balance = 0;
	
	public void withdraw(int amount) {
		synchronized (this) {
			if (balance <= 0) {
				try {
					System.out.println("Waiting for balance update");
					/* Step 4:  Program reads wait() or sleep() means, the thread will 
					 * be interrupted later.  Rest try block will not be read.  */
					wait();
					System.out.println("This line will never be printed.  ");
				}
				/* Step 7:  After thread got interrupted, InterruptedException happens and 
				 * the catch block executes.  */
				catch (InterruptedException e) {
					System.out.println("Thread got interrupted.   "); 
					/* I don't want negative value to be printed.  I place a return keyword 
					 * here to exit out of the method.  */
					return; 
				}
			}
		}
		balance = balance - amount;
		System.out.println("Withdrawl successful and the current balance is:  " + balance);
	}
	
	public static void main(String[] args) {
		
		/* Step 1:  Creates the object app.  */
		App app = new App();
		
		/* Creates Thread object thread1, which passes in an anonymous object Runnable 
		 * as argument, Runnable object contains an inner class, which contains the 
		 * run() method.  */
		Thread thread1 = new Thread(new Runnable() {
			@Override
			/* Step 3:  start() invokes the run() method.  */
			public void run() {
				/* app invokes withdraw method, passes in 1000 as argument.  */
				app.withdraw(1000);
			}
		});
		/* Step 2:  app invokes run() methods.  */
		thread1.start();
		
		if (balance <= 0) {
			/* Step 5:  Waits for 5 seconds before thread interruption.  */
			try {
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			/* Step 6:  Interrupts the thread that is waiting.  */
			thread1.interrupt();
		}
		
	}
}