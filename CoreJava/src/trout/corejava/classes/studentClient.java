package trout.corejava.classes;

public class studentClient {

	public static void main(String[] args) {
		Student studDishu = new Student();
		studDishu.studName = "Diyansha";
		studDishu.studId = 26;
		studDishu.studGrade = "second";
		
		
		
		Student studSneha = new Student();
		studSneha.studName = "Sneha";
		studSneha.studId = 23;
		studSneha.studGrade = "first";
	
		
		Student studSai = new Student();
		studSai.studName = "Sai";
		studSai.studGrade = "third";
	
		Student studNiki = new Student();
		System.out.println(studNiki.studName + "::" + studNiki.studId);
		
		Student studTanu = new Student();
		studTanu = studDishu;
		System.out.println(studTanu.studName);
		
		System.out.println(studSneha.studName);
		System.out.println(studDishu.studName);
		System.out.println(studSai.studName);
		System.out.println(studTanu.studName + "::" + studTanu.studId);
	}

}
