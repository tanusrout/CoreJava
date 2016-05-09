package trout.corejava.methods;

public class Calculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		//calc.calcTwoValue(3, 5);
		//calc.calcThreeValue(2,2,4);
		System.out.println(calc.calc(4,7 ) + calc.calc(3, 3, 2));
		

	}
	public int calc(int i, int j){ //method Overloading
		return i+j;
	}
	
	public int calc(int i , int j , int k){
		return i+j+k;
	}
}
