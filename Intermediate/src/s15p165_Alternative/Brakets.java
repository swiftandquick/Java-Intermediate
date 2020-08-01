package s15p165_Alternative;

public class Brakets {
	
	/* Without synchronization.  
	 * The output is different every time, the reason is because we have 
	 * two threads, and inside every thread we have this for loop so both 
	 * the threads are executing simultaneously.  As a result, we are 
	 * getting different output.  The hardware controls what the output 
	 * will be, so we have to apply restrictions.  */
	public void generate() {
		for (int i = 1; i <= 10; i++) {
			if (i <= 5) {
				System.out.print("[");
			}
			else {
				System.out.print("]");
			}
		}
		System.out.println();
	}
	
}