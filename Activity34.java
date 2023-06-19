package Class3;

import java.util.Scanner;

public class Activity34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = kb.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = kb.nextDouble();
        
        
        System.out.println("Enter the operator (+, -, *, /): ");
        char operator = kb.next().charAt(0);
        
        double res;
        
        switch (operator) {
        case '+':
        	res = num1 + num2;
        	break;
        case '-':
        	res = num1 - num2;
        	break;
        case '*':
        	res = num1 * num2;
        case '/':
        	if (num2 != 0) {
        		res = num1 / num2;
        	} else {
        		System.out.println("Error: Division by zero is not allowed.");
        	}
            break;
        default:
        	System.out.println("Error: Invalid operator.");
        	break;
        }
        
        kb.close();
	}

}
