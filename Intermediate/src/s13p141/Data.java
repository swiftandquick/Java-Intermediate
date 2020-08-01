package s13p141;

public class Data<T> {

	private T myVariable;
	
	public Data(T myVariable) {
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
	
}
