package Class3;

import java.util.Scanner;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monthNum;
		String monthName;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Give me month number: ");
		monthNum = kb.nextInt();
		
		switch (monthNum) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		default:
			monthName = "there is no such month";
			break;
		
		}
		
		System.out.println("you entered: " + monthName);
		
		kb.close();
	}

}
