package Class3;

import java.util.Scanner;

public class Activity26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = kb.nextInt();
		
		int absValue = Math.abs(num);
		
		System.out.println("the absolute value of the number is: " + absValue);
		
		 kb.close();
	}

}
