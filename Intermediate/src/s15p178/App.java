package s15p178;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* Needs to study this.  */
public class App {

	public static void main(String[] args) {
		/* Use ReentrantLock to solve deadlock problems.  */
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				/* flagLock1 and flagLock2 checks if the lock is available to be unlocked yet.  
				 * doneFlag1 and doneFlag2 checks if the lock is already unlocked.  */
				boolean flagLock1 = false;
				boolean flagLock2 = false;
				boolean doneFlag1 = false;
				boolean doneFlag2 = false;
				while (true) {
					try {
						/* If flagLock1 is false, try to see if lock1 is unlocked yet.  
						 * If lock1 is available to be unlocked, lock1.tryLock() returns 
						 * true.  */
						if (!flagLock1) {
							flagLock1 = lock1.tryLock();
						}
						/* Same applies for flagLock2 and lock2.  */
						if (!flagLock2) {
							flagLock2 = lock2.tryLock();
						}
					} 
					finally {
						/* If flagLock1 is true, or lock is available to be unlock.  And 
						 * doneFlag1 is false, means lock is yet to be unlocked.  then 
						 * execute the codes inside the if-statement.  */
						if (flagLock1 && !doneFlag1) {
							System.out.println("Inside thread1 on lock 1");
							/* Unlocks lock1.  */
							lock1.unlock();
							/* Now doneFlag1 is true, which means lock1 has been unlocked.  
							 * Once the lock is unlocked, I can no longer go back to 
							 * this conditional statement as it will remain false, since 
							 * the !doneFlag1 part is false.  */
							doneFlag1 = true;
						}
						if (flagLock2 && !doneFlag2) {
							System.out.println("Inside thread1 on lock 2");
							lock2.unlock();
							doneFlag2 = true;
						}
						if (flagLock1 && flagLock2) {
							break;
						}

					}
				}
			}
		});

		/* Same logic applies to thread2.  Keep in mind that thread1 and thread2 
		 * runs simultaneously.  */
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				boolean flagLock1 = false;
				boolean flagLock2 = false;
				boolean doneFlag1 = false;
				boolean doneFlag2 = false;
				while (true) {
					try {
						if (!flagLock1) {
							flagLock1 = lock1.tryLock();
						}
						if (!flagLock2) {
							flagLock2 = lock2.tryLock();
						}
					} 
					finally {
						if (flagLock1 && !doneFlag1) {
							System.out.println("Inside thread2 on lock 1");
							lock1.unlock();
							doneFlag1 = true;
						}
						if (flagLock2 && !doneFlag2) {
							System.out.println("Inside thread2 on lock 2");
							lock2.unlock();
							doneFlag2 = true;
						}
						if (flagLock1 && flagLock2) {
							break;
						}
					}
				}
			}
		});
		
		/* thread1 and thread2 starts simultaneously.  */
		thread1.start();
		thread2.start();
		
		/* Both threads join the main thread.  */
		try {
			thread1.join();
			thread2.join();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Inside main method.  No deadlock occurred.  ");

	}

}
