package s12p134;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		List<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		
		Sort app = new Sort();
		app.printList(countries);
		/* Sort by alphabetical order.  */
		countries.sort(null);
		app.printList(countries);
		/* Reverse order of the countries.  */
		Collections.reverse(countries);
		app.printList(countries);
	}
	
	
	public void printList(List<String> list) {
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println("Element:  " + iterator.next());
		}
		System.out.println();
	}
	
}
