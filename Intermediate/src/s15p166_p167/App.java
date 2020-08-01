package s15p166_p167;

public class App {
	
	public static void main(String[] args) {
		Brakets braket = new Brakets();

		/* Both threads are running simultaneously.  */
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for (int i = 1; i <= 5; i++) {
					braket.generate("Thread 1");
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time required for thread 1 was:  " + (endTime - startTime));
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for (int i = 1; i <= 5; i++) {
					braket.generate("Thread 2");
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time required for thread 2 was:  " + (endTime - startTime));
			}
		}).start();
	}
	
}
