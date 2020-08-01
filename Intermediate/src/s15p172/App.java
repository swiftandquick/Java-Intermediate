package s15p172;

public class App {

	public int counter = 0;
	
	public static void main(String[] args) {
		App app = new App();
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					app.counter++;
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				/* Sometimes output may not be 2000, the join method allows me to 
				 * consistently have 2000 as the output.  thread2 will wait for 
				 * thread1 to complete.  */
				try {
					thread1.join();
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				for (int i = 0; i < 1000; i++) {
					app.counter++;
				}
			}
		});

		/* thread1 and thread2 start with one another, without the join methods 
		 * being implemented, counter value will be 0 at the end.  */
		thread1.start();
		thread2.start();

		try {
			/* Main thread will wait for thread2 to complete.  */
			// thread1.join();
			thread2.join();
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/* Result will  be consistently 2000.  */
		System.out.println("The value of counter:  " + app.counter);
	}
	
}