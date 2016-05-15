package jrout.corejava.arrays;

public class TwoDimensionalArrayExample {

	public static void main(String[] args) {
		int details[][] = {{30,5},{20,4},{34,8}};
		for(int val[] : details){
			System.out.println(val[0] + " == " + val[1]);
			
		}
	}

}
