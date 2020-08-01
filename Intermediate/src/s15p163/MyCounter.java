package s15p163;

import java.util.Random;

public class MyCounter implements Runnable {

	private int threadNo;
	
	MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		Random random = new Random();
		for (int i = 1; i < 10; i++) {
			/* Each thread is executed at random time between 0 to 1 seconds.  
			 * Use sleep() method to ensure the result of the thread1 and thread2 
			 * print out concurrently.  Despite both threads start executing at 
			 * the same time, since both threads run on a random timer, so 
			 * the result may jumbo up.  */
			try {
				Thread.sleep(random.nextInt(1000));
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The value if i is:  "
					+ i + " and the thread number is:  " + threadNo);
		}
	}
	
}
