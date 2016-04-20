package DataTypes;
//ctrl + shift + f is for formatting
public class DataTypes {

	public static void main(String[] args) {
		byte age1 = 20;
		byte age2 = 30;
		System.out.println("value is "+ (age1+age2));
		
		short age1copy = age1;//here assign the value of int to short
		System.out.println(age1copy);
		
		float PhysicsMark = 65.5f; //identified as f in the end
		//int phycopymark = PhysicsMark;
		//Type mismatch: cannot convert from float to int
		int phycopymark = (int) PhysicsMark;
		System.out.println(phycopymark);//will print only 65 not 65.5 te decimal will go
		
		char male = 'm'; //it should be a single character
		char female = 'f';
		
		boolean IsThisJavaCouse = true;
	}

}
