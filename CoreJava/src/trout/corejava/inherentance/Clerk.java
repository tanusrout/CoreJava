package trout.corejava.inherentance;

public class Clerk extends Employee{
	

	private String clerkTask;

	public Clerk(String name,String clerkTask){
	super(name);
	this.clerkTask = clerkTask;
	}

	public String getClerkTask() {
		return clerkTask;
	}

	public void setClerkTask(String clerkTask) {
		this.clerkTask = clerkTask;
	}
	public void printDetails(){
		   System.out.println("Name of the clerk = "  +super.getName() );
		   System.out.println("clerkTask = " + this.clerkTask);
		   
}
}