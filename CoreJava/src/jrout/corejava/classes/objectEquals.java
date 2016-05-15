package jrout.corejava.classes;

public class objectEquals {

	public static void main(String[] args) {
		Student studDishu = new Student();
		studDishu.studId = 26;
		studDishu.studGrade = "second";
		studDishu.studName = "Diyansha";
		
		Student studRam = new Student();
		studDishu.studId = 26;
		studDishu.studGrade = "second";
		studDishu.studName = "Diyansha";
		
		Student studRam2 = studRam;
		
		//System.out.println(studDishu.studName.equals(studRam.studName));
		System.out.println(studDishu.equals(studRam));
		System.out.println(studDishu == studRam);
		
		System.out.println(studRam2.equals(studRam));
		System.out.println(studRam2 == studRam);

	}

}
