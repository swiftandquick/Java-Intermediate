package s15p170;

/* Look at the alternative version, it's more correct.  */
public class App {

	/* Static variable is created and shared among instance of all classes.  
	 * Using static variable means I don't have to create an object.  */
	// static public int balance = 1500;
	static public int balance = 0;
	
	
	public void withdraw(int amount) {
		/* this represents the current object, which is an object of App type.  Only withdraw 
		 * if balance <= 0, then it will remain as 0.  */
		synchronized (this) {
			if (balance <= 0) {
				try {
					System.out.println("Waiting for balance update.  Balance is $" + balance + ".  ");
					/* 6 seconds time wait.  That means deposit happens before withdrawal.  */
					wait(6000);
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		/* Withdrawal failed because both threads run at the same time, so the balance 
		 * value is treated as -1000 and not 1000.  For a better solution, check out 
		 * the alternative way of doing this.  */
		balance = balance - amount;
		if (balance >= 0) {
			System.out.println("Withdrawl success!  Balance is $" + balance + ".  ");
		}
		else {
			System.out.println("Invalid withdrawal, balance cannot be negative.  ");
		}
		
	}
	
	
	public void deposit(int amount) {
		balance = balance + amount;
		System.out.println("We are depositing the amount.  Balance is $" + balance + ".  ");
	}
	
	
	public static void main(String[] args) {
		App app = new App();
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				app.withdraw(3000);
			}
		});
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				/* Deposit happens 5 seconds after delay.  */
				try {
					Thread.sleep(5000);
				} 
				catch (InterruptedException e) {
					e.printStackTrace();
				}
				app.deposit(2000);
			}
		});
		thread2.start();
	}
	
}
