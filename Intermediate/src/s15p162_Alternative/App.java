package s15p162_Alternative;

public class App extends Thread {

	public static void main(String[] args) {
		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);
		
		/* counter1 and counter2 executes separately because run() method was invoked 
		 * instead of the start() method.  */
		long startTime = System.currentTimeMillis();
		
		/* Run should be called by JVM.  Unlike start(), invoking run() will make 
		 * counter1 and counter2 run separately.  */
		counter1.run();
		counter2.run();
		
		long endTime = System.currentTimeMillis();

		/* Because counter1 and counter2 are part of the main thread, so the duration of 
		 * for printing out all 18 lines will be calculated.  However, if I change 
		 * run() to start(), then the duration will not be calculated.  */
		System.out.println("Total time required:  " + (endTime - startTime));
		
	}
	
}
