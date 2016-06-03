package jrout.corejava.inherentance;

/**
 * Created by Jayram on 5/12/2016.
 */
public class SportsPerson extends Person {

    private String sports;

    public SportsPerson(String name) {
        super(name);
    }

    public SportsPerson(String name, int age) {
        super(name, age);
    }
    
    public void behaviour(){
    	System.out.println("Being a sportPerson i should be energetic");
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

	@Override
	public void performance() {
		System.out.println("Extra Performance");
		
	}
}
