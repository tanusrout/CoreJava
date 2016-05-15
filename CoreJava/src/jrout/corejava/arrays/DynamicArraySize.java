package jrout.corejava.arrays;

public class DynamicArraySize {

	public static void main(String[] args) {
		int size =Integer.parseInt(args[2]);
		String names[] = new String[5];
		names[0] = args[0];
		names[1] = args[1];
		System.out.println("dynamic value of names = " + names[0]  + names[1]);

	}

}
