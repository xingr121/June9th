package Class3;

import java.util.Scanner;

public class Activity12 {

	public static void main(String[] args, Object scanner) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

        System.out.print("Enter the length of side 1: ");
        double side1 = kb.nextDouble();

        System.out.print("Enter the length of side 2: ");
        double side2 = kb.nextDouble();

        System.out.print("Enter the length of side 3: ");
        double side3 = kb.nextDouble();

        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is an equilateral triangle.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is an isosceles triangle.");
        } else {
            System.out.println("The triangle is a scalene triangle.");
        }

        kb.close();	
		
	}

}
