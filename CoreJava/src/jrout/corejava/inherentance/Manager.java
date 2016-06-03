package jrout.corejava.inherentance;

public class Manager extends Employee {
	private String managerTask;

	public Manager(String name, String managerTask) {
		super(name);
		this.managerTask = managerTask;
	}

	public Manager(String name, String managerTask, int empId) {
		super(name);
		this.managerTask = managerTask;
		
	}
	public String getManagerTask() {
		return managerTask;
	}

	public void setManagerTask(String managerTask) {
		this.managerTask = managerTask;
	}

	@Override //overriding the method from superclass
	public void printDetails(){
		System.out.println("Manager Name =" + super.getName());
		System.out.println("Manager Task is  =" + this.managerTask);
	}

	@Override
	public void behaviour(){
		System.out.println("Being Manager i should be Strict");
	}
	public String toString(){
		return "Name = " + this.getName() + " Task = " + this.getManagerTask();
		
	}
}

