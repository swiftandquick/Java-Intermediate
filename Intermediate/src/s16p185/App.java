package s16p185;

import java.util.function.IntPredicate;

public class App {

	public static void main(String[] args) {
		
		IntPredicate lessThan18 = new IntPredicate() {
			@Override
			public boolean test(int value) {
				if (value < 18) {
					return true;
				}
				else {
					return false;
				}
			}
		};
		
		/* lessThan18 is the object name, use it to invoke the test method 
		 * and pass in three different numbers as argument.  If each number 
		 * is less than 18, it will return true, otherwise, it will return 
		 * false.  */
		System.out.println(lessThan18.test(12));
		System.out.println(lessThan18.test(18));
		System.out.println(lessThan18.test(24));
		
	}
	
}
