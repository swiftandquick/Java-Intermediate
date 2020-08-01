package s13p144;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		/* Passes in a list.  */
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Data data = new Data();
		data.printListData(list);

		/* Passes in an array.  */
		String[] stringArray = {"One", "Two", "Three", "Four"};
		Data data2 = new Data();
		data2.printArrayData(stringArray);
	}
	
}
