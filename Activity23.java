package Class3;

import java.util.Scanner;

public class Activity23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner kb = new Scanner(System.in);
		
	    System.out.println("Enter a five-digital number: ");
		int num = kb.nextInt();
		int temp = num;
		
		int reverseNumber = 0;
		
		while (temp > 0) {
			int remainder = temp % 10;
			reverseNumber = (reverseNumber * 10) + remainder;
			temp = temp / 10;
		}
		
		System.out.println("The  reversed numbers is: " + reverseNumber);
		
		boolean res = (reverseNumber == num) ? true : false;
		
		if (res) {
		System.out.println("The original and reversed numbers are equal");
		} else {
			System.out.println("The original and reversed numbers are not equal");
		}
		
		kb.close();
		}

}
