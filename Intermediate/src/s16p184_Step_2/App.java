package s16p184_Step_2;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(54);
		list.add(7);
		list.add(51);
		list.add(45);
		list.add(59);

		// Using for each loop to print out the list.  
		for(Integer i : list) {
			System.out.println(i);
		}
		
		System.out.println();
		
		/* list invokes forEach interface, passes i (Integer type) as 
		argument, then prints out each i from the list.  */ 
		list.forEach(i -> System.out.println(i));
		
		System.out.println();	
		
		/* Non-one-liner lambda expression.  */
		list.forEach(i -> {
			if (i < 10) {
				System.out.println(i + " is is a single digit number.  ");
			}
			else {
				System.out.println(i + " is greater than 10.  ");	
			}
		});

		System.out.println();
		
		/* Instead of numbers, I created objects of data type.  */
		List<Data> list2 = new ArrayList<>();
		list2.add(new Data("Chaand"));
		list2.add(new Data("John"));
		list2.add(new Data("Mia"));
		list2.add(new Data("Angelica"));
		list2.add(new Data("Roy"));
		
		list2.forEach(temp -> {
			System.out.println(temp.getName());
		});
		
	}
	
}
