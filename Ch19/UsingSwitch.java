public class UsingSwitch {
	private static String[] nameOfMonth = new String[] {
			"none", "January", "February", "March", "April", "May", "June",
			"July", "August", "September", "October", "November", "December"			
		};
	
	public static void main(String[] args) {
		System.out.println(nameOfMonth[1]);	// January
		System.out.println(nameOfMonth[8]);	// August

		System.out.println(tellNumberOfDaysByYearMonth(2004, 2));
	}
	
	public static int tellNumberOfDaysByYearMonth(int year, int month) {
		int numOfDays = 0;
		switch (month) {
	        case 1: case 3: case 5:
	        case 7: case 8: case 10:
	        case 12:
	            numOfDays = 31;
	            break;
	        case 4: case 6:
	        case 9: case 11:
	            numOfDays = 30;
	            break;
	        case 2:
	            if ((year % 4 == 0 && year % 100 != 0)
	                 || year % 400 == 0)
	                numOfDays = 29;
	            else
	                numOfDays = 28;
	            break;
	        default:
	            break;
		}
		return numOfDays;
    }
	
	public static void tellNameOfMonthByIfElse(int month) {
		if (month == 1) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.println("February");
		} else if (month == 3) {
			System.out.println("March");
		} else if (month == 4) {
			System.out.println("April");
		} else if (month == 5) {
			System.out.println("May");
		} else if (month == 6) {
			System.out.println("June");
		} else if (month == 7) {
			System.out.println("July");
		} else if (month == 8) {
			System.out.println("August");
		} else if (month == 9) {
			System.out.println("September");
		} else if (month == 10) {
			System.out.println("October");
		} else if (month == 11) {
			System.out.println("November");
		} else if (month == 12) {
			System.out.println("December");
		} else {
			System.out.println("Unknown month");
		}
	}
	
	public static void tellNameOfMonthBySwitch(int month) {
        String nameOfMonth;
        switch (month) {
            case 1:  nameOfMonth = "January";
                     break;
            case 2:  nameOfMonth = "February";
                     break;
            case 3:  nameOfMonth = "March";
                     break;
            case 4:  nameOfMonth = "April";
                     break;
            case 5:  nameOfMonth = "May";
                     break;
            case 6:  nameOfMonth = "June";
                     break;
            case 7:  nameOfMonth = "July";
                     break;
            case 8:  nameOfMonth = "August";
                     break;
            case 9:  nameOfMonth = "September";
                     break;
            case 10: nameOfMonth = "October";
                     break;
            case 11: nameOfMonth = "November";
                     break;
            case 12: nameOfMonth = "December";
                     break;
            default: nameOfMonth = "Unknown month";
                     break;
        }
        System.out.println(nameOfMonth);
	}
}