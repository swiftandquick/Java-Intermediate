package s17p192_p194;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
				
		System.out.println("Reading file with BufferedReader:  ");
		try {
			BufferedReader br = new BufferedReader(new FileReader("src\\s17p192_p194\\team.txt"));
			String line;
			/* Equate line with next line being read and checks weather the next line
			 * is null or not at the same time.  */
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nReading file with Scanner:  ");
		try {
			Scanner sc = new Scanner(new File("src\\s17p192_p194\\team.txt"));
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
