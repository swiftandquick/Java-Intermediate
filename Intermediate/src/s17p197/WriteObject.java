package s17p197;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* Run WriteObject before ReadObject to avoid errors.  */
public class WriteObject {

	public static void main(String[] args) {
		Vehicle bike = new Vehicle("bike", 9444);
		Vehicle car = new Vehicle("car", 4268);
		
		File file = new File("src\\s17p197\\vehicles.dat");
		
		try {
			file.createNewFile();
			FileOutputStream fos = new FileOutputStream(file);
			/* ObjectInputStream and ObjectOutputStream are high level streams 
			 * that contain the methods for serializing and de-serializing an 
			 * object.  */
			ObjectOutputStream obj = new ObjectOutputStream(fos);
			obj.writeObject(bike);
			obj.writeObject(car);
			System.out.println("Objects written onto the file.  ");
			obj.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
