package s13p144;

import java.util.List;

public class Data {

	/* A list of any type.  */
	public <E> void printListData(List<E> list) {
		for(E element : list) {
			System.out.println(element);
		}
	}
	
	/* An array of any type.  */
	public <E> void printArrayData(E[] arrayData) {
		for(E element : arrayData) {
			System.out.println(element);
		}
	}
	
}
