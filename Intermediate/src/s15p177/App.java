package s15p177;

public class App {

	public static void main(String[] args) {

		String lock1 = "lock1";
		String lock2 = "lock2";
		
		/* thread1 gets executed first.  */
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (lock1) {
					/* thread1 holds onto lock1 and needs lock2.  */
					System.out.println("Inside thread1 on lock1");
					synchronized(lock2) {
						/* No thread holds lock2, so thread1 holds onto lock2.  */
						System.out.println("Inside thread1 on lock2");
					}
				}
			}
		});
		
		/* Then thread2 gets executed first.  */
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				/* thread2 holds onto lock1 and needs lock2.  */
				synchronized (lock1) {
					System.out.println("Inside thread2 on lock1");
					synchronized(lock2) {
						/* No thread holds lock2, so thread1 holds onto lock2.  */
						System.out.println("Inside thread2 on lock2");
					}
				}
			}
		});
		
		/* Starts thread1 and thread2.  */
		thread1.start();
		thread2.start();
		
		/* thread1 joins main method then thread2 joins main method.  */
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
