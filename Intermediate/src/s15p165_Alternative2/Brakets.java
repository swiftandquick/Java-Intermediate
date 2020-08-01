package s15p165_Alternative2;

public class Brakets {

	/* This lock is specific to objects, so whenever we are making use of 
	 * different objects, multiple locks are used on different objects.  
	 * As the result, the locks are nullified.  */
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
