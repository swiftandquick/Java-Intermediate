package s16p181;

public class App {

	public static void main(String[] args) {
		
		/* Runnable as anonymous inner class.  */
		/*
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("I am inside thread1");
			}
		});
		thread1.start();
		*/

		/* Runnable is the interface with only one method, which is run(), 
		 * which means I can use lambda expression here.  This is an example 
		 * of functional interface.  The following lambda expression simplifies 
		 * the anonymous inner class from above to just one line.  */
		Thread thread1 = new Thread ( ()-> System.out.println("I am inside thread1.  ") );
		thread1.start();
		
		/* More than one statement for lambda expression.  */
		Thread thread2 = new Thread ( ()-> { 
			System.out.println("I am inside thread2.  ");
			System.out.println("I am also inside thread2.  ");
		});
		thread2.start();
		
		/* It can also be applied to anonymous threads.  */
		new Thread ( ()-> { 
			System.out.println("I am inside anonymous thread.  ");
			System.out.println("I am also inside anonymous thread.  ");
		}).start();
		
	}
	
}
