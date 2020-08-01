package s16p183_Lambda3;

public class App {

	public static void main(String[] args) {
		
		/* If I only want to print out result of equation, then I can use one-liner, 
		 * curly braces and return keyword are not used here.  It should be 77.  */
		Lambda lambda = (int x)-> x + 10 * 25 / 5 + 2;
		
		System.out.println(lambda.demo(25));
		
	}
	
}
