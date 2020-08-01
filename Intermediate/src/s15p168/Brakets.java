package s15p168;

public class Brakets {
	
	/* Using synchronized static method to solve inconsistent outputs.  
	 * Synchronized method allows one thread to be executed first before 
	 * another thread started, as you can see, thread1 is and thread2 
	 * are run separately, with thread1 starts first then thread2.  
	 */
	synchronized static public void generate(String threadCode) {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(10);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (i <= 5) {
				System.out.print("[");
			}
			else {
				System.out.print("]");
			}
		}
		System.out.println("Generated be thread:  " + threadCode);
	}
	
}
