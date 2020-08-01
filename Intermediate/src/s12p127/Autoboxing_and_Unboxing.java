package s12p127;

import java.util.ArrayList;

/* Wrapper class.  */
class intWrapper {
	public int intValue;
	
	intWrapper(int intValue) {
		super();
		this.intValue = intValue;
	}
	
	public int getIntValue() {
		return intValue;
	}
	
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
}


/* Main class.  */
public class Autoboxing_and_Unboxing {

	public static void main(String[] args) {
		/* ArrayList contains a list of intWrapper objects.  */
		ArrayList<intWrapper> studentNumbers = new ArrayList<>();
		/* Boxing:  Add an anonymous object to intWrapper class, the pass in the value 12.  
		 * Sets intValue as 12 via constructor inside intWrapper.  */
		studentNumbers.add(new intWrapper(12));
		/* Unboxing:  Get the 0th index of the studentNumbers array list, use the object 
		 * at index 0 to invoke the getIntValue() from the intWrapper class.  */
		System.out.println(studentNumbers.get(0).getIntValue());
		
		ArrayList<Double> demoList = new ArrayList<>();
		demoList.add(Double.valueOf(10.0));
		System.out.println(demoList.get(0));
	}
	
}
