package s14p153;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class App {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedBlockingDeque<>();
		
		deque.offer(1);
		deque.offer(2);
		deque.offer(3);
		deque.offer(4);
		deque.offer(5);
		deque.offer(6);
		deque.addFirst(0); // Adds 0 to begin of the queue.  
		deque.addLast(7); // Adds 7 to the end of queue.  
		deque.add(8);
		deque.add(9);
		deque.remove(); // Removes 0 (head element).  
		
		for (Integer element : deque) {
			System.out.println(element);
		}
		
	}
	
}
