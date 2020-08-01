package s15p171_Step_3;

public class App {

	static public int balance = 0;
	// static public int balance = 5000;
	
	public void withdraw(int amount) {
		synchronized (this) {
			if (balance <= 0) {
				try {
					/* Step 4:  Prints out the line below, then wait until interruption.  */
					System.out.println("Waiting for balance update.  ");
					wait();
					System.out.println("This line will never be printed.  ");
				}
				/* Step 9:  Because interrupt() interrupts wait().  This means the program can 
				 * catches an InterruptedException, and the codes inside the catch block executes.  */
				catch (InterruptedException e) {
					System.out.println("Original balance:  " + balance);
					System.out.println("Withdrawal balance:  " + amount);
					balance = balance - amount;
					System.out.println("Withdrawl successful and the current balance is:  " + balance);
					return; 
				}
			}
			/* If initial balance is > 0, program terminates after printing the line below.  */
			else {
				System.out.println("Initial balance is positive.  ");
			}
		}
	}
	
	/* Step 7:  Money is being deposited before withdrawal.  */
	public void deposit(int amount) {
		System.out.println("We are depositing the amount:  " + amount);
		balance = balance + amount;
	}
	
	public static void main(String[] args) {
		
		/* Step 1:  Creates a new object of App type named app.  */
		App app = new App();
		
		/* Step 2:  thread1 and thread2 starts running at the same time.  */
		Thread thread1 = new Thread(new Runnable() {
			/* Step 3:   Invokes withdraw method, passes in 1000 as argument.  */
			@Override
			public void run() {
				app.withdraw(1000);
			}
		});
		thread1.start();

		/* Step 2:  thread1 and thread2 starts running at the same time.  */
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				/* Step 5:  Waits for 5 seconds before calling the withdraw method.  */
				try {
					Thread.sleep(5000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				/* Step 6:  Invokes deposit method.  */
				app.deposit(2000);
				/* Step 8:  Interrupts the thread, so the waiting stops.  */
				thread1.interrupt();
			}
		});
		thread2.start();
	}
}