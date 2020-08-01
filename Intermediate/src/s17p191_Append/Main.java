package s17p191_Append;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File directory = new File("src\\s17p191_Append\\studyeasy");
		directory.mkdir();
		
		File file = new File("src\\s17p191_Append\\studyeasy\\team.txt");
		try {
			file.createNewFile();
			System.out.println("File created!  ");
		} 
		catch (IOException e) {
			System.out.println("Error occurred while creating the file.  ");
		}
		
		try {
			/* Because I didn't specified whether I should append (true) inside the 
			 * FileWriter argument, so the original contents will be overridden.  */
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
			bw.write("Chaand");
			bw.newLine();
			bw.write("Shabaz");
			bw.newLine();
			bw.write("Salim");
			bw.newLine();
			bw.write("Praful");
			bw.newLine();
			bw.write("Aarti");
			System.out.println("Writting onto the file completed.  ");  
			bw.close();
		} 
		catch (IOException e) {
			System.out.println("Error occurred while writing onto file.  ");
		}
	}
	
}
