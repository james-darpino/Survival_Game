import java.util.Scanner;

public class Q_3_11_Darpino {

    
  public static void main(String[] strings) {
	  	//Create Scanner
        Scanner input = new Scanner(System.in);

        // initialize days in x month, and initialize name of the month 
        int daysInMonth = 0; 
        String nameOfMonth = null;
        
        //User input
        System.out.print("Enter a month number: ");
        int currentMonth = input.nextInt();

        System.out.print(" Enter a year: ");
        int year = input.nextInt();
        
        // Create Switch statement to determine how many days are in each month
        switch (currentMonth) {
            case 1:
                nameOfMonth = "January";
                daysInMonth = 31;
                break;
            case 2:
                nameOfMonth = "February";
                daysInMonth = 28;
                break;
            case 3:
                nameOfMonth = "March";
                daysInMonth = 31;
                break;
            case 4:
                nameOfMonth = "April";
                daysInMonth = 30;
                break;
            case 5:
                nameOfMonth = "May";
                daysInMonth = 31;
                break;
            case 6:
                nameOfMonth = "June";
                daysInMonth = 30;
                break;
            case 7:
                nameOfMonth = "July";
                daysInMonth = 31;
                break;
            case 8:
                nameOfMonth = "August";
                daysInMonth = 31;
                break;
            case 9:
                nameOfMonth = "September";
                daysInMonth = 30;
                break;
            case 10:
                nameOfMonth = "October";
                daysInMonth = 31;
                break;
            case 11:
                nameOfMonth = "November";
                daysInMonth = 30;
                break;
            case 12:
                nameOfMonth = "December";
                daysInMonth = 31;
        }
        
        //Display results
        System.out.print(nameOfMonth + " " + year + " has " + daysInMonth + " days\n");
    }
}