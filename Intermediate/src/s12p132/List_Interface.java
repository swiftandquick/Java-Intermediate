package s12p132;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Interface {

	public static void main(String[] args) {
		List<String> countries = new ArrayList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		new List_Interface().printList(countries);
		
		List<String> demo = new LinkedList<>();
		demo.add("One");
		demo.add("Two");
		demo.add("Three");
		demo.add("Four");
		demo.add("Five");
		new List_Interface().printList(demo);
	}
	
	/* List includes LinkedList and ArrayList, that's why I can't iterate both lists.  */
	public void printList(List<String> list) {
		for(String element : list) {
			System.out.println(element);
		}
		System.out.println();
	}
	
}
