package jrout.corejava.arrays;

public class DoubleArray {

	public int length;
	
	public static void main(String[] args) {
		double[] values = new double[3];
		values[0] = 29.9;
			
		System.out.println("length of values=" + values.length);
		
		//cannot invoke length on array of double	
		System.out.println(values[0]);
		System.out.println(values[1]); //ans is 0.0
		System.out.println(values[3]);//arrayIndexout of bound exception
		
		double[] c;
		// System.out.println(c[0]);//value of c is not initialized
		
	}

}
