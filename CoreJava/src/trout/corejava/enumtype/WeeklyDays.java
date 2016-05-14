package trout.corejava.enumtype;

public class WeeklyDays {

	enum Days {
		SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);
	
	 private int value;
	 private Days(int value){
		 this.value = value;
	 }
	public int value(){
		return this.value;
	}
	public static void main(String[] args) {
		printDays(Days.SUNDAY);
	}

}

	public static void printDays(Days days) {
		if (days.equals(Days.SUNDAY)) {
			System.out.println("SUNDAY belongs to " + days.value());
		} else if (days.equals(Days.MONDAY)) {
			System.out.println("MONDAY belongs to " + days.value());
		} else if (days.equals(Days.TUESDAY)) {
			System.out.println("TUESDAY belongs to " + days.value());
		} else if (days.equals(Days.WEDNESDAY)) {
			System.out.println("WEDNESDAY belongs to " + days.value());
		} else if (days.equals(Days.THURSDAY)) {
			System.out.println("THURSDAY belongs to " + days.value());
		} else if (days.equals(Days.FRIDAY)) {
			System.out.println("FRIDAY belongs to " + days.value());
		} else if (days.equals(Days.SATURDAY)) {
			System.out.println("SATURDAY belongs to " + days.value());
		}
	}
}