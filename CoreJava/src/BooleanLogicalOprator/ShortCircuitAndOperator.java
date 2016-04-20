package BooleanLogicalOprator;

public class ShortCircuitAndOperator {

	public static void main(String[] args) {
		int rajuAge = 50;
		int rajuHeight = 6;
		
		int rohanAge = 40;
		int rohanHeight = 7;
		
		if((rajuAge == rohanAge) && ( rohanHeight >rajuHeight++)){
			System.out.println("i am happy");
			//if( rajuAge == rohanAge){
				System.out.println("same age");
				
			}
			System.out.println(rohanHeight =+ rajuHeight);
		//}else{
			//System.out.println("not happy");
		}
		
	}
	


	


