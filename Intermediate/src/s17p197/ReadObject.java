package s17p197;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		
		try {
			FileInputStream fio = new FileInputStream("src\\s17p197\\vehicles.dat");
			ObjectInputStream obj = new ObjectInputStream(fio);
			Vehicle v1 = (Vehicle) obj.readObject();
			Vehicle v2 = (Vehicle) obj.readObject();
			System.out.println("Object 1:  " + v1);
			System.out.println("Object 2:  " + v2);	
			obj.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
