package s14p154;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		Map<Integer, String> students = new HashMap<>();
		
		students.put(3, "Priyanka");
		students.put(1, "Rahul");
		students.put(2, "Mia");
		
		/* Iterate by using entrySet().  */
		for (Map.Entry<Integer, String> entry : students.entrySet()) {
			System.out.println("Key:  " + entry.getKey());
			System.out.println("Value:  " + entry.getValue());
		}
		
		/* Iterate by using keySet().  */
		for (Integer key : students.keySet()) {
			System.out.println("Key:  " + key);
			System.out.println("Value:  " + students.get(key));
		}
		
		/* Iterate by using Iterator.  */
		Iterator<Map.Entry<Integer, String>> entry = students.entrySet().iterator();
		
		while (entry.hasNext()) {
			/* Use temp to store each entry set.  */
			Map.Entry<Integer, String> temp = entry.next();
			System.out.println("Key:  " + temp.getKey());
			System.out.println("Value:  " + temp.getValue());
		}
		
	}
	
}
