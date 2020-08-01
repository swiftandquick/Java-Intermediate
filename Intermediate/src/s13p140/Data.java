package s13p140;

public class Data {

	private Object obj;
	
	/* Converts String into Object.  */
	public Data(Object obj) {
		this.obj = obj;
	}
	
	public Object getObj() {
		return obj;
	}
	
	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
	
}
