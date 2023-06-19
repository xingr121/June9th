package Class3;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num1, num2, num3, num4;
    
    Scanner kb = new Scanner(System.in);
    System.out.println("Please enter the first value?");
	num1 = kb.nextInt();
	System.out.println("Please enter the second value?");
	num2 = kb.nextInt();
	System.out.println("Please enter the third value?");
	num3 = kb.nextInt();
	System.out.println("Please enter the fourth value?");
	num4 = kb.nextInt();
	
	int max = num1;
	
	if (num2 > max) {
		max = num2;
	}
	if (num3 > max) {
		max = num3;
	}
	if (num4 > max) {
		max = num4;
	}
	System.out.println("The biggest number is: " + max);
	
	kb.close();
	
	}

}
