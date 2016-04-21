package trout.corejava.loop;

public class DoWhileLoop {

	public static void main(String[] args) {
		int ages[] = {20,30,40};
		int index = 0;
		
		do {
			System.out.println(ages[index++]);
		} while (index<ages.length);

	}

}
