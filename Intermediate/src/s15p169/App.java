package s15p169;

public class App {

	/* Marking flag as volatile will make it unable to be caught 
	 * by Thread.  Always remember whenever a thread is based on 
	 * a variable, always mark it as volatile.  */
	volatile public static int flag = 0;
	
	public static void main(String[] args) {
		/* This thread will continue to run without stopping.  */
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					if(flag == 0) {
						System.out.println("Running");
					}
					else {
						break;
					}
				}
			}
		}).start();
		
		/* Thread sleeps after 5 seconds.  This thread is needed to stop 
		 * the thread above.  Mark flag by 1.  */
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				flag = 1;
				System.out.println("Flag value updated");
			}
		}).start();
	}
	
}
