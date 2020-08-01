package s16p183;

public class App {

	public static void main(String[] args) {
		
		/* Variable x can be accessed by anonymous inner methods.  */
		int x = 10;
		
		Lambda lambda = new Lambda() {
			@Override
			public void demo() {
				/* Variable test cannot be accessed outside of the demo() method.  */
				int test = 101;
				System.out.println("x:  " + x);
				System.out.println("Value of test:  " + test);
			}
		};
		lambda.demo();
		
		/* Scope of i is inside the curly braces.  */
		{
			int i = 10;
			System.out.println("i:  " + i);
		}
		// System.out.println("i:  " + i);

		/* Scope of j is inside the curly braces and lines below the ending brace "}".  */
		int j = 10; {
			System.out.println("j:  " + j);
		}
		System.out.println("j:  " + j);
	}
	
}
