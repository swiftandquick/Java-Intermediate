package s15p162;

/* MyCounter is treated as a subclass of Thread.  */
public class MyCounter extends Thread {

	private int threadNo;
	
	MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	
	/* Override the run method to invoke countMe().  */
	@Override
	public void run() {
		countMe();
	}
	
	public void countMe() {
		for (int i = 1; i <= 9; i++) {
			/* Delays each subprocess by 1000 milliseconds, which is 1 second.  */
			try {
				sleep(1000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The value if i is:  "
					+ i + " and the thread number is:  " + threadNo);
		}
		System.out.println();
	}
	
}
