package s17p190;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		/* Makes a folder inside s17p190.  */
		File directory = new File("src\\s17p190\\studyeasy");
		directory.mkdir(); // Makes one directory.  
		System.out.println("Directory created!  ");
		
		/* Create a directory (Yong) inside a directory (author), that is 
		 * also inside the newly created directory (studyeasy).  */
		File directory2 = new File("src\\s17p190\\studyeasy\\author\\Yong");
		directory2.mkdirs(); // Makes multipel directories.  
		System.out.println("Directories created!  ");
		
		File file = new File("src\\s17p190\\studyeasy\\author\\Yong\\tests.txt");
		try {
			file.createNewFile();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File created!  ");
	}
	
}
