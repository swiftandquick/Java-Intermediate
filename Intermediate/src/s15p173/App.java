package s15p173;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

	public static void main(String[] args) {
		
		/* ExecutorService is used to manipulate thread pool.  Executors.newFixedThreadPool(2) 
		 * means only 2 threads are executed simultaneously.  */
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		/* Create a pool of 16 threads.  */
		SomeThread thread1 = new SomeThread("Thread 1");
		SomeThread thread2 = new SomeThread("Thread 2");
		SomeThread thread3 = new SomeThread("Thread 3");
		SomeThread thread4 = new SomeThread("Thread 4");
		SomeThread thread5 = new SomeThread("Thread 5");
		SomeThread thread6 = new SomeThread("Thread 6");
		SomeThread thread7 = new SomeThread("Thread 7");
		SomeThread thread8 = new SomeThread("Thread 8");
		SomeThread thread9 = new SomeThread("Thread 9");
		SomeThread thread10 = new SomeThread("Thread 10");
		SomeThread thread11 = new SomeThread("Thread 11");
		SomeThread thread12 = new SomeThread("Thread 12");
		SomeThread thread13 = new SomeThread("Thread 13");
		SomeThread thread14 = new SomeThread("Thread 14");
		SomeThread thread15 = new SomeThread("Thread 15");
		SomeThread thread16 = new SomeThread("Thread 16");
		
		/* Use the executorService object to execute threads in the following order.  
		 * thread1 and thread2, then thread3 and thread4.  */
		executorService.execute(thread1);
		executorService.execute(thread2);
		executorService.execute(thread3);
		executorService.execute(thread4);
		executorService.execute(thread5);
		executorService.execute(thread6);
		executorService.execute(thread7);
		executorService.execute(thread8);
		executorService.execute(thread9);
		executorService.execute(thread10);
		executorService.execute(thread11);
		executorService.execute(thread12);
		executorService.execute(thread13);
		executorService.execute(thread14);
		executorService.execute(thread15);
		executorService.execute(thread16);
		
		/* Shut down executor service after all threads are executed.  */
		executorService.shutdown();
		
	}
	
}
