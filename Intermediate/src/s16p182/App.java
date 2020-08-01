package s16p182;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Data> list = new ArrayList<>();
		
		list.add(new Data("Chaand"));
		list.add(new Data("Ed"));
		list.add(new Data("Angelica"));
		list.add(new Data("Maqbul"));
		list.add(new Data("John"));
		
		/* list contains a bunch of Data type objects, not Strings, 
		 * therefore they cannot be sorted.  */
		// Collections.sort(list);
		
		/* Now, I use anonymous inner class to compare.  */
		Collections.sort(list, new  Comparator<Data>() {
			@Override
			/* Compares Data type o1 and o2, but sort them based on their 
			 * String value (name), that's why I use getName() here.  */
			public int compare(Data o1, Data o2) {
				return o1.getName().compareTo(o2.getName());
				/* Reverse order.  */
				// return o2.getName().compareTo(o1.getName());	
			}
		});
		
		for(Data data:  list) {
			System.out.println(data.getName());
		}
	}
	
}
