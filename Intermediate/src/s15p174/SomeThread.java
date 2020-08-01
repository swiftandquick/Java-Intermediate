package s15p174;

import java.util.concurrent.CountDownLatch;

public class SomeThread extends Thread {

	private CountDownLatch latch;
	
	SomeThread(CountDownLatch latch) {
		this.latch = latch;
	}
	
	@Override
	public void run() {
		/* Thread invokes curretThread() method to get the current thread, then the current thread 
		 * invokes the getName() method to get the String value of the thread.  */
		System.out.println("Thread running with thread name " + Thread.currentThread().getName());
		System.out.println("Thread execution completed!  \n");
		/* Unfolds each time latch is called.  Since run() is called 4 times, latch can unfold up 
		 * to 4 times.  */
		latch.countDown();
	}
	
}
