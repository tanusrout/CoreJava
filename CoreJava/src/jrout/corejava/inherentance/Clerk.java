package jrout.corejava.inherentance;

public class Clerk extends Employee implements Running {
	private String clerkTask;

	public Clerk(String name, String clerkTask) {
		super(name);
		this.clerkTask = clerkTask;
	}

	public Clerk(String name, int age, String clerkTask) {
		super(name, age);
		this.clerkTask = clerkTask;
	}

	public String getClerkTask() {
		return clerkTask;
	}

	public void setClerkTask(String clerkTask) {
		this.clerkTask = clerkTask;
	}

	public void printDetails() {
		System.out.println("Clerk Name =" + super.getName());
		System.out.println("Clerk Task is  =" + this.clerkTask);
	}

	public void behaviour() {
		System.out.println("Being Clerk i should behave politly");
	}

	@Override
	public void run() {
		System.out.println("Clerks run very Fast");

	}

}
