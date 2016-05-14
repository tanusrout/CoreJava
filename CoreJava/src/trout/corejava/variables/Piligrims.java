package trout.corejava.variables;

public class Piligrims {
	private String name; //instance Variable
	public static int count = 0; // class level variable by using static no need to create reference
	
	public Piligrims(String name){
		this.name = name;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
