package s12p136_p137;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		List<Names> names = new LinkedList<>();
		names.add(new Names("Chaand"));
		names.add(new Names("Ed"));
		names.add(new Names("John"));
		names.add(new Names("Mia"));
		
		App app = new App();
		app.printList(names);
	
		/* Sorts the list.  */
		Collections.sort(names);
		app.printList(names);
		
		/* Object includes all types.  */
		List<Object> elements = new LinkedList<>();
		elements.add("Some String");
		elements.add(1);
		elements.add(2.0);
		elements.add(true);
		elements.add("#");
		elements.add(new Names("Maria"));
		
		app.printList2(elements);
		
	}
	
	
	public void printList(List<Names> list) {
		ListIterator<Names> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Name:  " + iterator.next());
		}
		System.out.println();
	}
	
	
	public void printList2(List<Object> list) {
		ListIterator<Object> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Name:  " + iterator.next());
		}
		System.out.println();
	}
	
}
