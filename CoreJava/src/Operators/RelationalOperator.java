package Operators;
//class name should start with capital letter
public class RelationalOperator {

	public static void main(String[] args) {
		//variable name should start with small letter or camelcase
		
		int rajuAge = 50;
		int  rajuHeight = 6;
		
		int rohanAge = 40;
		int rohanHeight = 5;
		
		System.out.println(rajuAge == rohanAge);//ans is false
		//System.out.println(rajuAge == rohanAge+10);//ans is true
		System.out.println(rajuAge != rohanAge);
		
		boolean isRajuAgeisRohanAge = (rajuAge != rohanAge);
		System.out.println(isRajuAgeisRohanAge);
		int totalAge = 0;
		
		if (rajuAge == rohanAge){
			totalAge = (rajuAge + rohanAge);
		}else{
			totalAge =(rajuAge + rohanAge)/2 ;
		}
			System.out.println ( totalAge);
		}

	}


