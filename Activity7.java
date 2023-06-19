package Class3;

import java.util.Scanner;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int dayNum;
		String dayName;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Give me day number: ");
		dayNum = kb.nextInt();
		
		switch (dayNum) {
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;
		default:
			dayName = "there is no such day";
			break;
		
		}
		
		System.out.println("you entered: " + dayName);

		kb.close();
		
	}

}
