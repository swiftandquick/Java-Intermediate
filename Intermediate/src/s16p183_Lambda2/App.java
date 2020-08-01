package s16p183_Lambda2;

public class App {

	public static void main(String[] args) {
		Lambda lambda = () -> {
			/* When lambda.demo() is called, the String will be printed first.  */
			System.out.println("We will return something.  ");
			return 10;
		};
		/* Then, since demo() returns integer variable 10, 10 will be printed next.  */
		System.out.println(lambda.demo());
	}
	
}
