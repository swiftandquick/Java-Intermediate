package s15p166_Alternative;

public class Brakets {

	/* Synchronized method, thread 1 needs to complete before thread 2 starts.  */
	synchronized public void generate() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(20);
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
		System.out.println();
	}
	
}
