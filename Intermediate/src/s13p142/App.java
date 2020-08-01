package s13p142;

public class App {

	public static void main(String args[]) {
		
		Data<Integer, String> data = new Data<Integer, String>(1, "Chaand");
		
		System.out.println("Key:  " + data.getKey() + "\nValue:  " + data.getValue());
		
		data.display("Books", 500);
	}
	
}
