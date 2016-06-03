package jrout.corejava.inherentance;

/**
 * Created by Jayram on 5/12/2016.
 */
public abstract  class Employee extends Person {

    private int empId;
    public Employee(String name) {
        super(name);
    }

    public Employee(String name, int age) {
        super(name, age);
    }
    
    public Employee(String name, int age, int empId) {
        super(name, age);
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    
    public void pray(String name){
    	
    }
    
    public void printDetails(){
    	System.out.println("Employee Details = " + super.getName() );
    	
    }

	

	@Override
	public void performance() {
		// TODO Auto-generated method stub
		
	}
}
