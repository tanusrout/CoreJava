package jrout.corejava.enumtype;

public class EnumExample {
	
	
	public static void main(String[] args) {
	
		String coffeeSize = "SMALL";
		String coffeeMedium = "MEDIUM";
		String coffeeLarge = "LARGE";
		
		EnumExample.orderCoffee(coffeeSize);
		EnumExample.orderCoffee("Jayram coffee");//its not  give any o/p so to avoid watch coffeeexample
	}
	
	public static void orderCoffee(String coffeeSize){
		if (coffeeSize.equals("SMALL")){
			System.out.println("I am going to serve small size coffee ");
		}else if(coffeeSize.equals("LARGE")){
			System.out.println("I am going to serve large size coffee");
			}else if(coffeeSize.equals("MEDIUM")){
			System.out.println("I am going to serve medium size coffee");
		}
	}

}
