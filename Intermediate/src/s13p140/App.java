package s13p140;

public class App {

	public static void main(String[] args) {
		/* String "Some data" is converted to Object type.  */
		Data regularData = new Data("Some data");
		System.out.println(regularData);
		
		/* "Some data" is passed on as genericData.  <String> */
		GenericClass<String> genericData = new GenericClass<String>("Some data");
		System.out.println(genericData);
	}
	
}
