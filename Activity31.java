package Class3;

import java.util.Scanner;

public class Activity31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner kb = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = kb.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = kb.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = kb.nextInt();
        
        if (num1 == num2 && num2 == num3) {
        	System.out.println("All numbers are equal.");
        } else {
        	System.out.println("Numbers are not equal.");
        }
        
        kb.close();
        
	}

}
