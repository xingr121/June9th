package Class3;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
	    System.out.println("Please enter a number:");
		int num = kb.nextInt();
		
		if (num%5 == 0 && num%11 == 0) {
			System.out.println("This number is divisible by 5 and 11");
		}else {
			System.out.println("This number is not divisible by 5 or 11");
		}
		kb.close();
	}

}
