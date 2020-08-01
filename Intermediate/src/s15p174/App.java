package s15p174;

import java.util.concurrent.CountDownLatch;

public class App {

	public static void main(String[] args) {
		
		/* There are 4 folds in my lock.  In order to release the lock, I need to 
		 * unfold the latch 4 times.  */
		CountDownLatch latch = new CountDownLatch(4);

		// Lock can still be released if countDown < 4;
		// CountDownLatch latch = new CountDownLatch(4);
		
		// Lock can will not be released if countDown > 4;
		// CountDownLatch latch = new CountDownLatch(5);
				
		
		/* Create SomeThread objects, pass in latch as argument.  */
		SomeThread thread1 = new SomeThread(latch);
		SomeThread thread2 = new SomeThread(latch);
		SomeThread thread3 = new SomeThread(latch);
		SomeThread thread4 = new SomeThread(latch);
		
		/* start() invokes run().  */
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		/* After unfolding the latch 4 times, the await() method releases the lock.  */
		try {
			latch.await();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("I am in main thread.  Lock is released.  ");
	}
	
}