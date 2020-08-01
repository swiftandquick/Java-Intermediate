package s12p131;

import java.util.LinkedList;

public class LinkedList_Operation {

	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("USA");
		countries.add("Poland");
		countries.add("Egypt");
		countries.add("Thailand");
		countries.add("Russia");
		new LinkedList_Operation().printList(countries);
		countries.add(1, "Canada");
		countries.add("Bragil");
		new LinkedList_Operation().printList(countries);
		countries.set(7, "Brazil");
		new LinkedList_Operation().printList(countries);		
	}
	
	public void printList(LinkedList<String> list) {
		for (String country : list) {
			System.out.println("Country:  " + country);
		}
		System.out.println();
	}
	
}
