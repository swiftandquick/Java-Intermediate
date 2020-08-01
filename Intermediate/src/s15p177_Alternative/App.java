package s15p177_Alternative;

public class App {

	public static void main(String[] args) {

		String lock1 = "lock1";
		String lock2 = "lock2";
		
		/* A deadlock occurred.  Keep in mind that thread1 and thread2 
		 * runs simultaneously.  */
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				/* thread1 holds onto lock1 but needs lock2.  While thread2 
				 * already holds lock2.  */
				synchronized (lock1) {
					System.out.println("Inside thread1 on lock1");
					synchronized(lock2) {
						System.out.println("Inside thread1 on lock2");
					}
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				/* thread2 holds onto lock2 but needs lock1.  While thread1 
				 * already holds onto lock1.  */
				synchronized (lock2) {
					System.out.println("Inside thread2 on lock2");
					synchronized(lock1) {
						System.out.println("Inside thread2 on lock1");
					}
				}
			}
		});
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("If there is no deadlock, this will be printed.  ");
		
	}
	
}
