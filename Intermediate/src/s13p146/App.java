package s13p146;

public class App {

	public static void main(String args[]) {
		/* Prints out 0 since two parts are the same.  */
		Data<Integer> data = new Data<Integer>(1); // Part 1
		System.out.println(data.compareTo(1)); // Part 2
	}
	
}
