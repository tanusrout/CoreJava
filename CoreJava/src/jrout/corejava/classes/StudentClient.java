package jrout.corejava.classes;

import trout.corejava.loop.StudentContact;
import trout.tutorials.machine.Computer;

public class StudentClient {

	public static void main(String[] args) {
		
		Student studDishu = new Student();
		StudentContact studContact= new StudentContact();
		Computer computer = new Computer();
		computer.name = "Macbook";
		studDishu.computer = computer;
		
		studContact.studPhoneNo = 449560992;
		studDishu.studName = "Diyansha";
		studDishu.studId = 26;
		studDishu.studGrade = "second";
		studDishu.studStudentContact = studContact;
		
	
	
		studContact.studPhoneNo = 2068994590;
		Student studSneha = new Student();
		studSneha.studName = "Sneha";
		studSneha.studId = 23;
		studSneha.studGrade = "first";
		studSneha.studStudentContact = studContact;
	
		studContact.studPhoneNo = 650338990;
		Student studSai = new Student();
		studSai.studName = "Sai";
		studSai.studGrade = "third";
		studSai.studStudentContact = studContact;
		
	
		Student studNiki = new Student();
		System.out.println(studNiki.studName + "::" + studNiki.studId);
		
		Student studTanu = new Student();
		studTanu = studDishu;
		System.out.println(studTanu.studName);
		
		System.out.println(studSneha.studName);
		System.out.println(studDishu.studName);
		System.out.println(studDishu.computer.name);
		System.out.println(studDishu.computer.model);
		System.out.println(studSai.studName);
		System.out.println(studTanu.studName + "::" + studTanu.studId);
		System.out.println(studDishu.studStudentContact.studPhoneNo);
		
	}

}
