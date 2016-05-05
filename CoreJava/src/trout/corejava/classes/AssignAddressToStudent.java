package trout.corejava.classes;


public class AssignAddressToStudent {

	public static void main(String[] args) {
		
		Student studDishu = new Student();
		System.out.println(studDishu.studAddress);//u will get null as nothing is assign to address
		//System.out.println(studDishu.studName);
		studDishu.studName = "Diyansha";
		System.out.println(studDishu.studName);
		System.out.println(studDishu.studName.toUpperCase());
		
		Address address = new Address();
		address.State = "North Carolina";
		address.Country = "USA";
		studDishu.studAddress = address;
		System.out.println(studDishu.studAddress.State);
		System.out.println(studDishu.studAddress.Country);
		
		Student studSai = new Student();
		studSai.studName = "SaiSree";
		studSai.studAddress = address;
		address.State = "NH";
		address.Country = "USA";
		System.out.println(studSai.studName );
		System.out.println(studSai.studAddress.State);
		System.out.println(studSai.studAddress.Country);
		
		
	}

}
