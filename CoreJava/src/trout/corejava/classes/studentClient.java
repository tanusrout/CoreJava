package trout.corejava.classes;

public class studentClient {

	public static void main(String[] args) {
		Student studDishu = new Student();
		studDishu.studId = 26;
		studDishu.studGrade = "second";
		studDishu.studName = "Diyansha";
		
		
		Student studSneha = new Student();
		studSneha.studId = 23;
		studSneha.studGrade = "first";
		studSneha.studName = "Sneha";
		
		Student studSai = new Student();
		studSai.studGrade = "third";
		studSai.studName = "Sai";
		
		Student studTanu = new Student();
		studTanu = studDishu;
		System.out.println(studTanu.studName);
		
		System.out.println(studSneha.studName);
		System.out.println(studDishu.studName);
		System.out.println(studSai.studName);
		System.out.println(studTanu.studName + "::" + studTanu.studId);
	}

}
