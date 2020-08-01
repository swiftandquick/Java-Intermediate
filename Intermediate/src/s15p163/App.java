package s15p163;

/* In this class, two threads run concurrently, one thread runs independently.  
 * All three threads starts at the same time.  */
public class App {

	/* I can throw InterruptedException at main method.  */
	public static void main(String[] args) throws InterruptedException {
		
		/* MyCounter is the subclass of Runnable, so it's basically as the following:  
		 * new Thread(new Runnable()); */
		Thread thread1 = new Thread(new MyCounter(1));
		Thread thread2 = new Thread(new MyCounter(2));
		
		/* Both thread1 and thread2 called start(), so they will run simultaneously.  */
		thread1.start();
		thread2.start();
		
		/* Iterates 9 times, runs independently from 1 to 9.  This thread runs independently 
		 * from thread1 and thread2.  Unlike thread1 and thread2, each iteration has the 
		 * sleep time of 0.5 seconds.  */
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i < 10; i++) {
					try {
						Thread.sleep(500);
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					};
					System.out.println("New pop up thread:  " + i + " and it's anonymous.  ");
				}
			}
		}).start(); // Starts the run() method that is inside the anonymous Thread object.  
	}
	
}
