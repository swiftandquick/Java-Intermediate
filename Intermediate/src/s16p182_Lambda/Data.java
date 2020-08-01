package s16p182_Lambda;

public class Data {

	private String name;
	
	
	Data(String name) {
		super();
		this.name = name;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}
	
}
