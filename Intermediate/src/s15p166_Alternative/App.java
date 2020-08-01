package s15p166_Alternative;

public class App {

	public static void main(String[] args) {
		Brakets braket = new Brakets();

		new Thread(new Runnable() {
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for (int i = 1; i <= 5; i++) {
					braket.generate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Thread 1 duration:  " + (endTime - startTime));
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for (int i = 1; i <= 5; i++) {
					braket.generate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Thread 2 duration:  " + (endTime - startTime));
			}
		}).start();
	}
	
}
