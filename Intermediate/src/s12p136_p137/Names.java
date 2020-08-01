package s12p136_p137;

public class Names implements Comparable<Names> {

	private String name;
	
	
	public Names(String name) {
		this.name = name;
	}
	
	
	/* Overrides the compareTo method to suit my interest.  
	 * In this case, the elements are sort by the length of String.  */
	@Override
	public int compareTo(Names obj) {
		if (name.length() == obj.name.length()) {
			return 0;
		}
		else if (name.length() < obj.name.length()) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	
	@Override
	public String toString() {
		return name;
	}
	
}
