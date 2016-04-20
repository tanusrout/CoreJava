package trout.corejava.arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int jayAge = 34;
		int jayGrade = 5;
		
		int tanuAge = 33;
		int tanuGrade = 4;
		
		int jayDetails[] = new int[2];
			jayDetails[0] = jayAge;
			jayDetails[1] = jayGrade;
			
			System.out.println("jayAge = " +jayDetails[0]);
			System.out.println("jayGrade = " +jayDetails[1]);
			
			int tanuDetails[] = {tanuAge , tanuGrade};
			System.out.println("tanuAge =" + tanuDetails[0]);
			System.out.println("tanuGrade = " + tanuDetails[1]);

	}

}
