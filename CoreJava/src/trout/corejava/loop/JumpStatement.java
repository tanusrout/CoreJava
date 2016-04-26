package trout.corejava.loop;

public class JumpStatement {

	public static void main(String[] args) {
		
		for(int i = 0;i < 10;i++){
		if(i == 2){
			continue;
		}	
		System.out.println("value = " +i);
		}

	}

}
