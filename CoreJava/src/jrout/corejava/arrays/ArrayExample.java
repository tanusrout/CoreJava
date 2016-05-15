package jrout.corejava.arrays;

public class ArrayExample {

	public static void main(String[] args) {
		int age1 = 7;
		int age2 = 33;
		int age3 = 34;
		int ages[] = new int[3];
		System.out.println(ages.length);
		System.out.println(ages[0]);
		ages[0] = age1;
		ages[1] = age2;
		ages[2] = age3;
		
		System.out.println(ages[0] + " " + ages[1] +" " +ages[2] );
		int heights[] = {4,5,6};
		System.out.println(heights[2]);
		

	}

}
