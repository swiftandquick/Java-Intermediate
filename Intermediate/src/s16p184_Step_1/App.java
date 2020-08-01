package s16p184_Step_1;

public class App {

	public static void main(String[] args) {
		int x = 10;
		
		/* Adding the line below will make the program crash.  x is treated as a 
		 * final variable but it should not be modified.  Because program reads 
		 * x as 10 first, then runs the thread.  (I could be wrong.)  */
		// x++;
		
		/* Creates an anonymous thread, which contains the Runnable() functional interface, 
		 * the first () represents calling the run() method.  Attach .start() at the end to 
		 * invoke the run() method.  */
		new Thread(() -> System.out.println("The value of x is " + x)).start();
	}
	
}
