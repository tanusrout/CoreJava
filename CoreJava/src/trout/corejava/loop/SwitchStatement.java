package trout.corejava.loop;

public class SwitchStatement {

	public static void main(String[] args) {
		int ages[] = {20,30,40};
		
		for(int age :ages){
			
			switch (age) {
			case 20:{
				System.out.println("I am still Young");
				break;
			}
			
			case 30: {
				System.out.println("Wow i reached 30");
		
			}
			
			case 40: {
				System.out.println("OOPs i reached 40");
			break;
			}
			default:
				System.out.println("You are not yet born...");
				break;
			}
			
		}
	}

}
