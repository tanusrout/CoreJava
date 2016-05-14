package trout.corejava.variables;

public class Temple {

	public static void main(String[] args) {
		Piligrims one = new Piligrims("one");
		Piligrims two = new Piligrims("two");
		
		//doDarshan(); cannot invoke a non-static method from a static method
		Temple temple = new Temple();
		temple.doDarshan(one);
		temple.doDarshan(two);
		
		System.out.println(one.getName());
		System.out.println(Piligrims.count);
		
		
	}
	public void doDarshan(Piligrims piligrim){
		System.out.println("Piligrims " + piligrim.getName() + "is doing Darshan");
		
	}

}
