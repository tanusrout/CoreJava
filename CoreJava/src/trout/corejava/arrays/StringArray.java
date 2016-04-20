package trout.corejava.arrays;

public class StringArray {

	public static void main(String[] args) {
		
		String names[] = new String[2];
		names [0]= "tanu";
		names[1] = "jay";
		
		printMessage("jayramdetails","tanudetails");
		
		addValue(23,44,88);
		
		System.out.println("length of string= " + names[0].length());
		System.out.println(names[0]);
		System.out.println(names[1]);
	}
	public static void printMessage(String name1,String name2){
		System.out.println("Hello" + name1 +" " + name2);
		
	}
	
	public static void addValue(int a,int b,int c){
		System.out.println(a+b+c);
	}
}
