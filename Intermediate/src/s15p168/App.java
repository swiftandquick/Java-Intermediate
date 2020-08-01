package s15p168;

public class App {

	public static void main(String[] args) {

		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					Brakets.generate("Thread 1");
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					Brakets.generate("Thread 2");
				}
			}
		}).start();
	}
	
}
