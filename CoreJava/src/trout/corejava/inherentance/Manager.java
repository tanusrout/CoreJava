package trout.corejava.inherentance;

public class Manager extends Employee {
	

	private String managerTask;

	public Manager(String name,String managerTask){
	super(name);
	this.managerTask = managerTask;
	}


	public String getManagerTask() {
		return managerTask;
	}

	public void setManagerTask(String managerTask) {
		this.managerTask = managerTask;
	}
	public void printDetails(){
		   System.out.println("Name of the Manager = " + super.getName());
		   System.out.println("Task of Manager = " + this.managerTask);
}
}