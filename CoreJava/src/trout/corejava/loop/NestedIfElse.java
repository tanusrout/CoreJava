package trout.corejava.loop;

public class NestedIfElse {

	public static void main(String[] args) {
		int ages[] = {20,30,40};
		
		for(int age :ages){
			
			if(age == 20){
				System.out.println("I am still Young");	
				System.out.println("I play football");
			}else if (age ==30){
				System.out.println("Wow i reached 30");
			}else if(age == 40){
				System.out.println("OOPs i have reached 40");
				}else{
					System.out.println("You are not yet born");
				}
			
		}

	}

}
