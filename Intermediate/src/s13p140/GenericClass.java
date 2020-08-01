package s13p140;

public class GenericClass<T> {

	/* T can contain anything.  In this case, T takes in a String type.  */
	private T data;
	
	public GenericClass(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
}
