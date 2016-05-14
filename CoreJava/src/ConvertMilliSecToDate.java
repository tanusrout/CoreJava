import java.util.Date;

public class ConvertMilliSecToDate {

	public static void main(String[] args) {
		long milli = 1462928931995l;
		Date date = new Date(milli);
		System.out.println(date);
	
	}

}
