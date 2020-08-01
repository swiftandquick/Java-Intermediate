package s12p125_p126;

import java.util.ArrayList;

public class Array_List {

	static ArrayList<String> listNames = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		listNames.add("Chaand");
		listNames.add("John");
		listNames.add("Steve");
		listNames.add("Pooja");
		listNames.add("Salim");
		listNames.add("Rahul");
		listNames.add("Mia");
		listNames.add("Angel");
		
		Array_List app = new Array_List();
		app.displayList(listNames);
		app.removeNameByPosition(0);
		app.removeNameByString("Angel");
		
		int position = app.search("Pooja");
		if (position != -1) {
			app.modifyName(position, "Emma");
		}
		System.out.println();
		app.displayList(listNames);
		
		System.out.println(listNames.get(0));
	}
	
	
	/* Displays the list elements with a for each loop.  */
	public void displayList(ArrayList<String> names) {
		for (String name : names) {
			System.out.println(name);
		}
	}
	
	
	/* Removes the element that is associated with the index.  */
	public void removeNameByPosition(int position) {
		listNames.remove(position);
	}
	
	
	/* Removes element based on String.  */
	public void removeNameByString(String name) {
		listNames.remove(name);
	}
	
	
	/* Sets the index (position) with a new String variable (newName).  */
	public void modifyName(int position, String newName) {
		listNames.set(position, newName);
	}
	
	
	/* Search the index of name.  */
	int search(String name) {
		return listNames.indexOf(name);
	}
	
}