package trout.corejava.enumtype;


enum Coffee{
	SMALL , MEDIUM ,LARGE;
}
public class CoffeeExample {

	public static void main(String[] args) {
		orderCoffee(Coffee.SMALL);
		orderCoffee(Coffee.MEDIUM);
		orderCoffee(Coffee.LARGE);
		orderCoffee(null);
		
		//orderCoffee("Jayram Coffee");//got compilation issue as i have only 3 options
		//orderCoffee(10); it will not take anyother details apart from set of constants.

	}
	public static void orderCoffee(Coffee coffee){
		if (coffee.equals(Coffee.SMALL)){
			System.out.println("I am going to serve small size coffee ");
		}else if(coffee.equals(Coffee.LARGE)){
			System.out.println("I am going to serve large size coffee");
			}else if(coffee.equals(Coffee.MEDIUM)){
			System.out.println("I am going to serve medium size coffee");
		}
	}

}
         //Enum is a datatype with finite numbers of values like a constants.