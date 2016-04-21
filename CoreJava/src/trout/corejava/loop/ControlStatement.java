package trout.corejava.loop;

public class ControlStatement {

	public static void main(String[] args) {
		int ages[] = {20,30,40};
		
		for(int age : ages){
			if(age == 20){
				System.out.println("I am still Young");
			}
			if(age == 30){
				System.out.println("Wow i have reached 30 !!");
			}else {
				System.out.println("OOPs i have reached 40");
			}
			
		} 

	}

}
