package s15p175;

import java.util.concurrent.ArrayBlockingQueue;

public class App {

	static int counter = 0;
	
	
	public static void main(String[] args) {
		/* Create an ArrayBlockingQueue object that contains up to 10 integers.  */
		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

		/* Creates a Producer object produce, passes in queue as argument.  */
		Producer produce = new Producer(queue);
		
		/* Creates a Thread type producerThread, has produce (Runnable type) 
		 * as argument.  */
		Thread producerThread = new Thread(produce);
		
		/* Starts the thread.  */
		producerThread.start();
	}
	
}
