package s15p164;

public class App {

	public static int counter = 0;
	
	/* Treats main thread as object, that's why I throw an InterruptedException.  */
	public static void main(String[] args) throws InterruptedException {
		
		/* Runnable is a class which includes threads.  Creates a Thread method, which 
		 * passes Runnable object type variable to the parameter.  Instead of making a 
		 * Runnable class or a subclass of the Runnable class, I define the details of 
		 * the Runnable class by using double brace initialization.  The braces create 
		 * an anonymous inner class.  */
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					App.counter++;
				}
				System.out.println("Thread 1 is over.  ");
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					App.counter++;
				}
				System.out.println("Thread 2 is over.  ");
			}
		});
		
		/* start() invokes run().  Even though run() is inside an anonymous inner class, 
		 * it can still be called.  */
		thread1.start();
		thread2.start();

		/* sleep() method is needed or else counter remains as 0.  sleep() is 
		 * used to pause the execution of current thread for a specified time.  
		 * After the pause, execution starts.  */
		/* Makes the main thread sleep for 2 seconds.  Sometimes the result is 
		 * slightly around 1000, that means execution of both of these threads are 
		 * not over in these two seconds.  Synchronization is needed to to get 
		 * consistent results.  */
		Thread.sleep(2000);

		System.out.println("The value of counter is:  " + App.counter);
		
	}
	
}
