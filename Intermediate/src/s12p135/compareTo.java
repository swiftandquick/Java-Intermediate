package s12p135;

import java.util.LinkedList;
import java.util.List;

public class compareTo {

	public static void main(String args[]) {
		int result;
		List<String> countries = new LinkedList<>();
		countries.add("USA");
		/* Gets 0th index of countries, compare it to String "USA".  */
		result = countries.get(0).compareTo("USA");
		/* Output is 0, which means the index element and the compared element are the same.  */
		System.out.println(result);
	}
	
}
