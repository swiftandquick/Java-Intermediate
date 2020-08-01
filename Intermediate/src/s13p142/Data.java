package s13p142;

public class Data<K, V> {

	private K key;
	private V value;
	
	Data(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	/* Use generic in a method.  */
	public <E, N> void display(E element, N number) {
		System.out.println("Element:  " + element + "\nNumber:  " + number);
	}
	
}
