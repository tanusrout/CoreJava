package DataTypes;

public class UpperCase {

	public static void main(String[] args) {
		String river = "Mississipi";
		String bigRiver = river.toUpperCase();
		System.out.println("river in uppercase "  + bigRiver );
		System.out.println(bigRiver.length());
		
		String greeting = "Hello Diyansha!";
		System.out.println(greeting.toUpperCase());
		System.out.println(river.replace("ssipi", "ouri"));
	}
	

}
