package s14p155_p157;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		/* Because it's a tree map, the Code class will have a compareTo method.  */
		Map<Code, String> lectures = new TreeMap<>();
		lectures.put(new Code("S01", "L03"), "Generics");
		lectures.put(new Code("S01", "L01"), "Files under Java");
		lectures.put(new Code("S02", "L03"), "Network Programming");
		lectures.put(new Code("S01", "L07"), "OOP");
		lectures.put(new Code("S01", "L05"), "Methods");
		lectures.put(new Code("S01", "L03"), "Expressions");
		
		for (Entry<Code, String> entry : lectures.entrySet()) {
			/* Key is whatever the toString method return value is.  */
			System.out.println("Key:  " + entry.getKey());
			System.out.println("Value:  " + entry.getValue());
		}
		
		String findValue = lectures.get(new Code("S01", "L05"));
		System.out.println(findValue);
		
		/* String objects overrides the equals() method, so String objects with the same 
		 * contents will have the same hash code.  */
		String name1 = new String ("Chaand");
		String name2 = new String ("Chaand");
		String name3 = new String ("Chand");

		/* Hash code of name1 and name2 are the same.  So equals() method should return true.  
		 * String class already overrides equals() method, so name1 and name2 has the same 
		 * hashCode returned.  */
		System.out.println("Name 1 Hash Code:  " + name1.hashCode());
		System.out.println("Name 2 Hash Code:  " + name2.hashCode());
		System.out.println("Name 3 Hash Code:  " + name3.hashCode());
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		
		Code code1 = new Code("S01", "L03");
		Code code2 = new Code("S01", "L03");
		Code code3 = code1;
		
		/* code1 and code2 are stored in different memory locations, so their hashCodes are 
		 * different.  Since code3 is set equal to code1, hashCodes are the same.  */
		System.out.println("Code 1 Hash Code:  " + code1.hashCode());
		System.out.println("Code 2 Hash Code:  " + code2.hashCode());
		System.out.println("Code 3 Hash Code:  " + code3.hashCode());
		System.out.println(code1.equals(code2));
		System.out.println(code1.equals(code3));
	}
	
}