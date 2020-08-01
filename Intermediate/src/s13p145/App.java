package s13p145;

public class App {

	public static void main(String[] args) {
		
		/* App refers to object of the class App, which is this class.  */
		Data<Integer, App> data = new Data<Integer, App>(1, new App());
		System.out.println(data);
		/* getValue() retrieves the value stored in V, use it to invoke test() method.  */
		data.getValue().test();
		
		data.display("one", 1);
		
	}
	
	
	public void test() {
		System.out.println("Testing...");
	}
	
}
