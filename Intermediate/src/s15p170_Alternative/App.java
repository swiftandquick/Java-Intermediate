package s15p170_Alternative;

/* This is the better version.  */

public class App {

	// static public int balance = 0;
	static public int balance = 5000;
	
	public void withdraw(int amount) {
		/* Step 2:  Since thread1 has no delay, this will be executed first.  */
		System.out.println("Withdraw begins...  ");
		synchronized (this) {
			try {
				System.out.println("Waiting for balance update.  Balance is $" + balance + ".  ");
				/* Step 6: thread1 waits until notifyAll() is invoked. Once notifyAll() is
				 * invoked, thread1 no longer waits and starts to execute rest of the codes in
				 * withdraw(). Instead of 6 seconds wait time, I rely on notifyAll() method.
				 * Now, I wait for notifyAll() to be invoked then this thread will continue to
				 * execute.  */
				wait();
				/* Step 7:  thread1 sleeps for another 5 seconds.  */
				Thread.sleep(5000);
				balance = balance - amount;
				if (balance >= 0) {
					System.out.println("Withdrawl success!  Balance is $" + balance + ".  ");
				} 
				else {
					System.out.println("Invalid withdrawal, balance cannot be negative.  ");
				}

			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void deposit(int amount) {
		/* Step 4:  Since thread2 has delay, this will be executed next.  */
		System.out.println("Deposit begins...  ");
		balance = balance + amount;
		System.out.println("We are depositing the amount.  Balance is $" + balance + ".  ");
		/* Step 5:  thread2 invokes the wait() method with notifyAll().  
		 * notifyAll() invokes up all wait() methods on the same object.  */
		synchronized(this) {
			notifyAll();
			// notify() also works, but it invokes one wait() method rather than one.  
			// notify();
		}
	}
	
	
	public static void main(String[] args) {
		App app = new App();

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				app.withdraw(1000);
			}
		});

		/* Step 1:  thread1 starts at the same time as thread2.  */
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				/* Step 3 (thread2):  Deposit happens 5 seconds after delay.  */
				try {
					Thread.sleep(5000);
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				app.deposit(2000);
			}
		});
		
		/* Step 1:  thread2 starts at the same time as thread1.  */
		thread2.start();
	}
	
}
