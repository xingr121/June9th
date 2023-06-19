package Class3;

import java.util.Scanner;

public class Activity29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of days late: ");
		int dayLate = kb.nextInt();
		
		if (dayLate <= 5) {
			System.out.println("you are late to return the book, the fine is : 50 paise.");
		} else if ( dayLate >5 && dayLate <= 10) {
			System.out.println("you are late to return the book, the fine is : 1rupee.");
		} else if ( dayLate > 10&& dayLate <= 30) {
			System.out.println("you are late to return the book, the fine is : 5rupees.");
		} else {
			System.out.println("you are late to return the book more than 30 days, your membership will be cancelled.");
		}
		
		kb.close();
		
	}

}
