package trout.corejava.loop;

public class JumpStatementBreak {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++){
			
			if(i==3){
			
				break;
				
			}
			System.out.println("value = " +i);
		}

	}

}
