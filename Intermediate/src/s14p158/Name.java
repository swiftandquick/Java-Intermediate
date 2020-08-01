package s14p158;

public class Name implements Comparable<Name> {

	private String name;
	
	public Name(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Name [name=" + name + "]";
	}
	
	@Override
	public int compareTo(Name o) {
		return getName().compareTo(o.getName());
	}
	
}
