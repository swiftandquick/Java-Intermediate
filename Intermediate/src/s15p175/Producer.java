package s15p175;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer implements Runnable {

	private ArrayBlockingQueue<Integer> queue;
	
	
	Producer(ArrayBlockingQueue<Integer> queue) {
		super();
		this.queue = queue;
	}
	
	
	@Override
	public void run() {
		while (true) {
			try {
				/* Each time run() is invoked, counter increments by 1.  
				 * counter is static variable from App class.  */
				Thread.sleep(1000);
				queue.put(App.counter++);
				System.out.println("Value added in the queue:  " + App.counter);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
