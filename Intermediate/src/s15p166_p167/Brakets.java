package s15p166_p167;

public class Brakets {

	/* Synchronized block on object.  */
	private Object lock = "lock";
	
	public void generate(String thread) {
		
		// Synchronization on current object (this) works the same way here.  
		// synchronized (this) {
		
		/* Using synchronized block rather than method.  Synchronized a block.  
		 * Using synchronized block to solve inconsistent outputs.  The result 
		 * is that thread 1 and thread 2 executes as a pair concurrently.  */
		synchronized (lock) {
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(10);
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i <= 5) {
					System.out.print("[");
				} else {
					System.out.print("]");
				}
			}
			System.out.println("\t" + thread);
		}

		/* If generate() is synchronized.  This part does nothing, except extending 
		 * each thread's iteration duration by 250 milliseconds after the first 
		 * for loop is executed.  
		 */
		for (int j = 0; j <= 10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
