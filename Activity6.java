package Class3;

import java.util.Scanner;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the year?");
		int year = kb.nextInt();
		
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("This year is leap year");
		}else {
			if(year % 400 == 0) {
				System.out.println("This year is leap year");
			}
		}
		kb.close();

	}

}
