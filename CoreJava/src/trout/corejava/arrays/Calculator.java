package trout.corejava.arrays;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Hello Calculator");
		int value = calculate(3,4);
		System.out.println(value);
	}
	
	public static int calculate(int a, int b){
		return a+b;
	}

}
