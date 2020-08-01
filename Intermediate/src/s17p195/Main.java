package s17p195;

import java.io.File;

public class Main {

	/* For practice purpose, copy team.txt onto the same package as this 
	 * java file, then run the Main java file.  */
	
	public static void main(String[] args) {
		File file = new File("src\\s17p195\\team.txt");

		if (file.delete()) {
			System.out.println("Deletion is successful.  ");
		}
		else {
			System.out.println("Cannot find file.  ");
		}
	}
	
}
