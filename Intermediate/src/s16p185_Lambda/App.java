package s16p185_Lambda;

import java.util.function.IntPredicate;

public class App {

	public static void main(String[] args) {
		
		/* test method takes in i (int type) as argument, note that IntPredicate 
		 * only takes int type variable as argument.  Returns true if i < 18 and 
		 * i > 10, otherwise, it will return false.  */
		IntPredicate lessThan18 = i -> i < 18;
		IntPredicate moreThan10 = i -> i > 10;
		
		System.out.println(lessThan18.and(moreThan10).test(6));
		System.out.println(lessThan18.and(moreThan10).test(12));
		System.out.println(lessThan18.test(18) && moreThan10.test(18));
		System.out.println(lessThan18.test(24) && moreThan10.test(24));
		
		System.out.println(lessThan18.or(moreThan10).test(6));
		System.out.println(lessThan18.or(moreThan10).test(12));
		System.out.println(lessThan18.test(18) || moreThan10.test(18));
		System.out.println(lessThan18.test(24) || moreThan10.test(24));
		
	}
	
}
