package s15p162;

public class App {

	/* Throws InterruptedException at the start so I don't have to use it.  */
	public static void main(String[] args) throws InterruptedException {
		
		/* counter1 and counter2 are threads, since MyCounter is the subclass of 
		 * the object type Thread.  */
		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);
		
		long startTime = System.currentTimeMillis();
		
		/* The start() method allows both counter1 and counter2 to run simultaneously.  
		 * Because counter1 and counter2 are subclasses of Thread, it means they can 
		 * be treated as threads.  */
		counter1.start();
		counter2.start();
		
		/* If I don't have either Thread.sleep(5000) or Thread.sleep(10000), then 
		 * the process duration is printed at the start as 0 seconds.  Because thread 
		 * is sleeping in the main method of App class rather than in MyCounter.  Thus, 
		 * total time for execution is not being calculated.  */
		
		// Process duration will be printed before the last thread is printed, and it's 5.  
		// Thread.sleep(5000);
		
		/* Process duration will be printed after the last thread is printed, and it's 10
		 * This thread runs independently from counter1 and counter2.  */
		Thread.sleep(10000);
		
		long endTime = System.currentTimeMillis();
		
		/* Calculate the process duration in seconds.  */
		long duration = (endTime - startTime) / 1000;
		System.out.println("Process duration:  " + duration + " seconds.  ");
	}
	
}
