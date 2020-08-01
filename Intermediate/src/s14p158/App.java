package s14p158;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayBlockingQueue<>(6);
		queue.offer(1);
		queue.offer(6);
		queue.offer(7);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5); // Not added because queue is full.  
		
		Set<Name> set = new HashSet<>();
		set.add(new Name("Chaand"));
		set.add(new Name("John"));
		set.add(new Name("Aafiya"));
		set.add(new Name("Armaan"));
		set.add(new Name("Mia"));
		set.add(new Name("Chaand"));
		
		/* List contains all Object types, including Integer and Name.  */
		List<Object> list = new ArrayList<>();
		list.addAll(queue);
		list.addAll(set);
		
		/* Print out each object in list.  */
		for (Object element : list) {
			System.out.println(element);
		}
		
		System.out.println();
		
		List<Name> list2 = new ArrayList<>();
		list2.addAll(set);
		/* Sort list2 via natural order.  */
		Collections.sort(list2);
		
		for (Name name : list2) {
			System.out.println(name);
		}
		
		System.out.println();
		
		// Find the index of the element 'new Name ("Chaand").  
		System.out.println(Collections.binarySearch(list2, new Name ("Chaand")));

	}
	
}
