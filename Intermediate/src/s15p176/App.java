package s15p176;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {

	static int counter = 0;
	static Lock lock = new ReentrantLock();
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				/* Locks onto thread1.  Executes codes between lock() and unlocked().  */
				lock.lock();
				try {
					for (int i = 1; i <= 1000; i++) {
						App.counter++;
					}
				}
				/* Adds the finally method to unlock the thread no matter what happened.  */
				finally {
					/* Unlocks from thread1.  So, I can start running thread2.  */
					lock.unlock();
					System.out.println("Current counter value:  " + counter);
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				/* Locks onto thread2.  Executes codes between lock() and unlocked().  */
				lock.lock();
				try {
					for (int i = 1; i <= 1000; i++) {
						App.counter++;
					}
				}
				finally {
					/* Unlocks from thread2.  So, I can start running main thread.  */
					lock.unlock();
					System.out.println("Current counter value:  " + counter);
				}
			}
		});
		
		/* thread1 and thread2 starts simultaneously.  */
		thread1.start();
		thread2.start();

		/* thread1 and thread2 joins the main thread.  Without joining the main thread, 
		 * the final value of the counter will be 0.  */
		thread1.join();
		thread2.join();
		
		System.out.println("The final value of counter is " + counter);
		
	}
	
}
