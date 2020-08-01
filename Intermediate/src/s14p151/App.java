package s14p151;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String args[]) {
		
		/* Inner method to compare key.  Sort by integer value from smallest to largest.  
		 * The Comparator function contains an inner method.  */
		Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if (obj1.getKey() < obj2.getKey()) {
					return -1; // 1 position behind.  
				}
				else if (obj1.getKey() > obj2.getKey()) {
					return 1; // 1 position forward.  
				}
				else {
					return 0; // Same position.  
				}
			}
		};
		
		/* Inner method to compare value.  Sort by String length from shortest to longest.  
		 * The Comparator function contains an inner method.  */
		Comparator<Data<Integer, String>> COMPARE_VALUE = new Comparator<Data<Integer, String>>() {
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if (obj1.getValue().length() < obj2.getValue().length()) {
					return -1;
				}
				else if (obj1.getValue().length() > obj2.getValue().length()) {
					return 1;
				}
				else {
					return 0;
				}
			}
		};
		
		/* Since TreeSet needs to be sorted, I invoked the Comparator function name COMPARE_KEY.  */
		Set<Data<Integer, String>> set = new TreeSet<>(COMPARE_KEY);
		set.add(new Data<Integer, String>(1, "Dwight"));
		set.add(new Data<Integer, String>(5, "Marie"));
		set.add(new Data<Integer, String>(9, "Jim"));
		set.add(new Data<Integer, String>(2, "Rosenberg"));
		set.add(new Data<Integer, String>(5, "Marie"));
		
		for(Data<Integer, String> element : set) {
			System.out.println(element);
		}
		
		System.out.println();

		/* Since TreeSet needs to be sorted, I invoked the Comparator function name COMPARE_VALUE.  */
		Set<Data<Integer, String>> set2 = new TreeSet<>(COMPARE_VALUE);
		set2.add(new Data<Integer, String>(1, "Dwight"));
		set2.add(new Data<Integer, String>(5, "Marie"));
		set2.add(new Data<Integer, String>(9, "Jim"));
		set2.add(new Data<Integer, String>(2, "Rosenberg"));
		set2.add(new Data<Integer, String>(5, "Marie"));
		
		for(Data<Integer, String> element : set2) {
			System.out.println(element);
		}
	}
	
}
