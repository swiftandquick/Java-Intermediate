package s15p165_Alternative2;

public class App {

	public static void main(String[] args) {
		
		/* Change braket (one object) to braket1 and braket2 (two objects), 
		 * all the sudden the console result is varies again.  */
		Brakets braket1 = new Brakets();
		Brakets braket2 = new Brakets();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					braket1.generate("Thread 1");
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					braket2.generate("Thread 2");
				}
			}
		}).start();
		
	}
	
}
