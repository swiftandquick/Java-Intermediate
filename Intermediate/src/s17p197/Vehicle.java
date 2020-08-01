package s17p197;

import java.io.Serializable;

/* Serializable interface is required for serialization to happen.  */
public class Vehicle implements Serializable {

	/* Adds serial version ID is just an identification for the class.  If I 
	 * try to change the ID and run the ReadObject file, then it will present 
	 * errors in the console.  
	 */
	private static final long serialVersionUID = 1483507626969985340L;
	private String type;
	private int number;
	
	public Vehicle(String type, int number) {
		this.type = type;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", number=" + number + "]";
	} 
	
}
