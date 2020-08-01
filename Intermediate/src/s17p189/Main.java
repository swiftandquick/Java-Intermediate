package s17p189;

import java.io.File;
import java.io.IOException;

public class Main {

	/* Throws IOException in case if createNewFile() fails to create a new file.  */
	public static void main(String[] args) throws IOException {
		
		/* Creates a file object called StudyEasy.txt in the same package, using relative path.  */
		File file = new File("src\\s17p189\\StudyEasy.txt");
		
		/* Use the object file to invoke createNewFile() method, a file should be created.  */
		file.createNewFile();
		
		System.out.println("StudyEasy.txt created.  ");
		
		/* Creates a file object called StudyHard.txt in the same package, using absolute path.  */
		File file2 = new File("C:\\Users\\Yong Chen\\Desktop\\Eclipse Work Space\\Java + JSP + Restful WS + Spring\\Intermediate\\src\\s17p189\\StudyHard.txt");
		file2.createNewFile();
		System.out.println("StudyHard.txt created.  ");
	}
	
}
