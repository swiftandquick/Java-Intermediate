package s12p133;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iterator_Demo {

	public static void main(String[] args) {
		List<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		
		/* Use anonymous object to invoke a method.  */
		new Iterator_Demo().printList(countries);
	}
	
	/* Iterator variable iterator is used to iterate list.  If iterator 
	 * checks that list has the next element (hasNext), it will print out the 
	 * next element (next).  */
	public void printList(List<String> list) {
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println("Element:  " + iterator.next());
		}
	}
	
}
