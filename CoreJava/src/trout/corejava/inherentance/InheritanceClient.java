package trout.corejava.inherentance;

public class InheritanceClient {

	public static void main(String[] args) {
		Person per = new Person("Tanu");
		per.printDetails();
		
		Clerk clerk = new Clerk("Shyam" , "responsible for printing");
		clerk.printDetails();
		Manager mang = new Manager("Ram" , "Responsible for Managing");
		mang.printDetails();

	}

}
