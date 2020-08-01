package s13p141;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		
		/* The List contains the object type Data, since Data is a generic class, 
		 * its generic type is <Object>, which accepts any variable.  */
		List<Data<Object>> elements = new LinkedList<>();
		elements.add(new Data<Object>("Chaand"));
		elements.add(new Data<Object>("Ed"));
		elements.add(new Data<Object>("John"));
		elements.add(new Data<Object>("Mia"));
		elements.add(new Data<Object>("Some String"));
		elements.add(new Data<Object>(1));
		elements.add(new Data<Object>(2.0));
		elements.add(new Data<Object>("#"));
		
		App app = new App();
		app.printList(elements);
		
	}
	
	
	public void printList(List<Data<Object>> list) {
		ListIterator<Data<Object>> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element:  " + iterator.next());
		}
	}
	
}
