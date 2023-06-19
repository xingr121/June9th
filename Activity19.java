package Class3;

import java.util.Scanner;

public class Activity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the current year: ");
		int currentYear = kb.nextInt();
		
		System.out.println("Enter the year of joining: ");
		int joinYear = kb.nextInt();
		
		int yearOfService = currentYear - joinYear;
		
		if (yearOfService > 3) {
			int bonusAmount = 2500;
			System.out.println("Bonus: Rs. " + bonusAmount);
		}
		
		kb.close();
	}

}
