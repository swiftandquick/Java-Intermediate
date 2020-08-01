package s15p171_Step_1;

public class App {

	static public int balance = 0;
	
	public void withdraw(int amount) {
		synchronized (this) {
			if (balance <= 0) {
				try {
					System.out.println("Waiting for balance update");
					/* Since wait() doesn't have a duration (in milliseconds) inside the parentheses, 
					 * and there is no notify() method to invoke wait().  waiting duration will last 
					 * indefinitely.  */
					wait();
					System.out.println("This will line never shown.   ");
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		balance = balance - amount;
		System.out.println("Withdrawl successful and the current balance is:  " + balance);
	}
	
	public static void main(String[] args) {
		App app = new App();
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				app.withdraw(1000);
			}
		});
		thread1.start();
		
	}
}