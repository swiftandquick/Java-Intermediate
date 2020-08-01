package s15p165_Alternative;

public class App {

	public static void main(String[] args) {
		Brakets braket = new Brakets();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					braket.generate();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					braket.generate();
				}
			}
		}).start();
		
	}
	
}
