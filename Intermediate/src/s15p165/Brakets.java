package s15p165;

public class Brakets {

	/* Synchronized an entire method.  Output is consistent.  Synchronization 
	 * eliminates race condition, so second thread starts after first thread 
	 * is done executing.  */
	synchronized public void generate(String thread) {
		for (int i = 1; i <= 10; i++) {
			if (i <= 5) {
				System.out.print("[");
			}
			else {
				System.out.print("]");
			}
		}
		System.out.print("\t" + thread + "\n");
	}
	
}
