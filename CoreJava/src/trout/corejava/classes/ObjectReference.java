package trout.corejava.classes;

public class ObjectReference {

	public static void main(String[] args) {
		Student studDishu = new Student();
		studDishu.studId = 26;
		studDishu.studGrade = "second";
		studDishu.studName = "Diyansha";
		
		Student studJay = new Student();
		studDishu.studId = 66;
		studDishu.studGrade = "seventh";
		studDishu.studName = "Jay";
		
		studJay = studDishu;
		System.out.println(studJay.studName);
	}

}
