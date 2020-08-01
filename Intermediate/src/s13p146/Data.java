package s13p146;

public class Data<T extends Comparable<T>> implements Comparable<T> {

	private T myVariable;
	
	Data(T myVariable) {
		super();
		this.myVariable = myVariable;
	}
	
	public T getMyVariable() {
		return myVariable;
	}
	
	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}
	
	/* Method invokes getMyVariable() to get the current value of myVariable (1), 
	 * then compares it to the parameter variable o (1).  */
	@Override
	public int compareTo(T o) {
		return getMyVariable().compareTo(o);
	}
	
}
