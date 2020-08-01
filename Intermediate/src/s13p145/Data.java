package s13p145;

public class Data<K, V> {

	private K key;
	private V value;
	
	/* K stores Integer type, V stores App object type.  The this.value 
	 * will retrieve a strange number as its value.  */
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	/* Number is a class under Java.  */
	public <E, N extends Number> void display(E element, N number) {
		System.out.println("Element:  " + element + "\nNumber:  " + number);
	}
	
}
