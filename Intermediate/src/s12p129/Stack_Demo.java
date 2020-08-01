package s12p129;

import java.util.Stack;

public class Stack_Demo {

	public static void main(String[] args) {
		Stack<Integer> demo = new Stack<>();
		demo.push(0);
		demo.push(1);
		demo.push(2);
		demo.push(3);
		demo.push(4);
		demo.push(5);
		demo.pop(); // Remove the last object.  
		
		for(Integer temp : demo) {
			System.out.println(temp);
		}
		
		// Gets the last object in stack.  
		System.out.println(demo.peek());
		
		// Checks if stack is empty.  
		if (demo.isEmpty()) {
			System.out.println("Stack is empty.  ");
		}
		else {
			System.out.println("Stack is not empty.  ");
		}
	}
	
}
