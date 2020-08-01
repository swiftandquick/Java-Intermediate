package s15p173;

/* Since SomeTHread inherits from Thread, I can override the run() method.  */
public class SomeThread extends Thread {

	private String name;
	
	/* Constructor.  */
	SomeThread(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("Starting thread:  " + name);
		try {
			/* 3 seconds time window between each starting thread pair and ending thread pair.  */
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread ended:  " + name);
	}
	
}
