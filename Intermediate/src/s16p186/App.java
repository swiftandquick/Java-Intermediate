package s16p186;

import java.util.function.IntPredicate;

public class App {

	public static void main(String[] args) {
		IntPredicate lessThan18 = i -> i < 18;
		IntPredicate moreThan10 = i -> i > 10;
		
		/* Use anonymous App type object to invoke the demo method.  */
		new App().demo(10, lessThan18, moreThan10);
		new App().demo(15, lessThan18, moreThan10);
		new App().demo(20, lessThan18, moreThan10);
	}
	
	/* Predicates can be used as parameter arguments.  */
	public void demo(int x, IntPredicate lessThan18, IntPredicate moreThan10) {
		if (lessThan18.and(moreThan10).test(x)) {
			System.out.println("The input is less than 18 and more than 10.  ");
		}
		else {
			System.out.println("Input out of range or invalid input.  ");
		}
	}
	
}
