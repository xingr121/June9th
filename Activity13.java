package Class3;

import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter the coefficient of x^2: ");
        double a = kb.nextDouble();

        System.out.print("Enter the coefficient of x: ");
        double b = kb.nextDouble();

        System.out.print("Enter the constant term: ");
        double c = kb.nextDouble();
        
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has a single root: " + root);
        } else {
            System.out.println("The equation has no real roots. It has complex roots.");
        }

        kb.close();
	}

}
