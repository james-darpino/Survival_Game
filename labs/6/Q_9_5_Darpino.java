import java.util.GregorianCalendar;

public class Q_9_5_Darpino {

	public static void main(String[] args) {

		//call the gregorian calendar class
		java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();

		java.util.GregorianCalendar calendar2 = new java.util.GregorianCalendar();
		//call get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH),
		// get(GregorianCalendar.DAY_OF_MONTH)
		long currentYear = calendar.get(GregorianCalendar.YEAR);
		long currentMonth = calendar.get(GregorianCalendar.MONTH);
		long currentDay = calendar.get(GregorianCalendar.DAY_OF_MONTH);

		//display current year, month and day
		System.out.println("The current year is: " + currentYear + "");
		System.out.println("The current month is: " + currentMonth + "" );
		System.out.println("The current day is: " + currentDay + "");

		//set get elapsed time
		calendar2.setTimeInMillis(1234567898765L);

		//call get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH),
		// get(GregorianCalendar.DAY_OF_MONTH)
		long year = calendar2.get(GregorianCalendar.YEAR);
		long month = calendar2.get(GregorianCalendar.MONTH);
		long day = calendar2.get(GregorianCalendar.DAY_OF_MONTH);

		//display
		System.out.println(" ");
		System.out.println("The time elapsed since January 1 1970 brings us to");
		System.out.println("The year is: " + year + "");
		System.out.println("The month is: " + month + "" );
		System.out.println("The day is: " + day + "");
	}

}
