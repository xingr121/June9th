package Class3;

import java.util.Scanner;

public class Activity32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = kb.nextInt();
        int count = 0;
        
        while (number != 0) {
        	number /=10;
        	count++;
        }
        
        System.out.println("Number of digits: " + count);
        
        kb.close();
	}

}
