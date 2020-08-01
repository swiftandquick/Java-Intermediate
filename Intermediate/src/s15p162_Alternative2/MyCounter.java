package s15p162_Alternative2;

public class MyCounter extends Thread {

	private int threadNo;
	
	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	
	public void countMe() {
		for (int i = 1; i <= 9; i++) {
			/* Every time the for loop iterates, there is a 0.5 seconds wait.  */
			try {
				sleep(500);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value if i is:  "
					+ i + " and the thread number is:  " + threadNo);
		}
		System.out.println();
	}
	
}
