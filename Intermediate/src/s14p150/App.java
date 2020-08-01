package s14p150;

import java.util.LinkedHashSet;
import java.util.Set;

public class App {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 30; i > 0; i--) {
			set.add(i);
		}
		for (int i : set) {
			System.out.println(i);
		}
	}
	
}
