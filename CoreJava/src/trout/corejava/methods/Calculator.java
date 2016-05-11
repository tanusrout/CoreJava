package trout.corejava.methods;

public class Calculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.calc(3, 5);
		calc.calc(2,2,4);
		System.out.println(calc.calc(4,7 ));
		System.out.println(calc.calc(3, 3, 2));
		System.out.println(calc.calc(3,4,5,6,7,8,9));

	}
	public int calc(int i, int j){ //method Overloading
		return i+j;
	}
	
	public int calc(int i , int j , int k){
		return i+j+k;
	}
	public int calc(int...array){
		int temp = 0;
		for(int val : array){
			temp+= val;
			}
		return temp;
	}
	}

