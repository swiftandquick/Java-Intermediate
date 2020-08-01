package s16p180;

public class App {

	public static void main(String[] args) {
		
		/* An inner class that overrides the inner abstract method called demo().  */
		Lambda innerClass = new Lambda() {
			@Override
			public void demo() {
				System.out.println("Statement 1");
			}
		};
		
		/* Anonymous inner class methods can be invoked.  */
		innerClass.demo();
		
		/* Single statement in lambda expression.  The () refers to 
		 * the overridden demo() method, since demo() also has nothing 
		 * inside the parameter as argument.  */
		Lambda lambda = ()-> System.out.println("Statement 2");
		lambda.demo();
		
		/* Multiple statements in lambda expression.  */
		Lambda lambda2 = ()-> {
			System.out.println("Statement 3");
			System.out.println("Statement 4");
		};
		lambda2.demo();
		
	}
	
}
