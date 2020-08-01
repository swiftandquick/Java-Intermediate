package s16p182_Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Data> list = new ArrayList<>();
		
		list.add(new Data("Chaand"));
		list.add(new Data("Ed"));
		list.add(new Data("Angelica"));
		list.add(new Data("Maqbul"));
		list.add(new Data("John"));
		
		/* According to Oracle, Comparator is also an functional interface, 
		 * so Lambda expression can be applied.  */
		Collections.sort(list, (Data o1, Data o2)-> {
			return o1.getName().compareTo(o2.getName());
		});
		
		/* This also works.  Keep in mind that there I should not write the "return"
		 * in one line Lambda expressions.  */
		// Collections.sort(list, (Data o1, Data o2)-> o1.getName().compareTo(o2.getName()));
		
		for(Data data : list) {
			System.out.println(data.getName());
		}
		
		System.out.println();
		
		/* Using lambda expression to compare name length instead.  */
		Collections.sort(list, (Data o1, Data o2)-> {
			if (o1.getName().length() > o2.getName().length()) {
				return 1;
			}
			else if (o1.getName().length() < o2.getName().length()) {
				return -1;
			}
			else {
				return 0;
			}
		});
		
		for(Data data : list) {
			System.out.println(data.getName());
		}
	}
	
}
