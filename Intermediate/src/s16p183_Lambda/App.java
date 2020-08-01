package s16p183_Lambda;

public class App {

	public static void main(String[] args) {
		/* Retrieves the variables (int, float) that has been passed in, 
		 * then print those variables out.  */
		Lambda lambda = (int x, float y)-> {
			System.out.println("The value of x is:  " + x);
			System.out.println("The value of y is:  " + y);
			System.out.println("Statement from demo method.  ");
		};
		
		/* Passes in two arguments, first one as int type, second one as float type.  */
		lambda.demo(201, 24.6f);
	}
	
}
