package trout.corejava.inherentance;

public class Employee extends Person {

	private int employeeId;

	public Employee(String name) {
		super(name);

	}
	public Employee(String name,int age){
		super(name,age);
	}


	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

}
