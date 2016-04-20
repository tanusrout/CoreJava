package Operators;

public class AdditionAssignment {

	public static void main(String[] args) {
		int age = 30;
		//age = age+2;
		
		//instead of age2 we can use addition assignment +=
		age+=2;
		
		System.out.println(age);
		
		age-=2;//substraction assignmant
		System.out.println(age);
		
		age*=2;
		System.out.println(age);
		
		age%=2;
		System.out.println(age);
	}

}
