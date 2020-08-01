package s14p152;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {

	public static void main(String[] args) {
		// This queue has the limit of 6.  
		Queue<Integer> queue = new LinkedBlockingQueue<>(6);
		
		try {
			/* FIFO:  First in first out.  */
			queue.add(1);
			queue.add(2);
			queue.add(3);
			queue.add(4);
			queue.add(5);
			queue.add(6);
			queue.remove(); // Removes first element (1).  
			queue.remove(); // Removes first element (2).  
			queue.add(7);
			/* offer is another way to add, but results in no exception, it's more preferable than add.  */
			System.out.println(queue.offer(8) ? "8 exists.  " : "8 doesn't exist.  ");
			System.out.println(queue.offer(9) ? "9 exists.  " : "9 doesn't exist.  ");
			queue.add(10); // Queue is full.  
		}
		catch (IllegalStateException e) {
			System.out.println("Queue is full.  ");
		}
		finally {
			// Gets the head of the element, which is 3.  
			System.out.println("Head is " + queue.element() + ".  ");
			// Gets and removes the head element, which is 3.  
			System.out.println("Head is still " + queue.poll() + ", then it gets removed.  ");
		}
		
		for (Integer element : queue) {
			System.out.println(element);
		}
	}
	
}
