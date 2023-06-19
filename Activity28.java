package Class3;

import java.util.Scanner;

public class Activity28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		double hardness, carContent, tenStrength;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the hardness: ");
		hardness = kb.nextDouble();
		
		System.out.println("Enter the carbon content: ");
		carContent = kb.nextDouble();
	
		System.out.println("Enter the tensile: ");
		tenStrength = kb.nextDouble();
		
		int grade;
		
		if (hardness > 50 && carContent < 0.7 && tenStrength > 5600 ) {
			grade = 10;
		} else if (hardness > 50 && carContent < 0.7) {
			grade = 9; 
		} else if (carContent < 0.7 && tenStrength > 5600) {
			grade = 8;
		} else if (hardness > 50 && tenStrength > 5600) {
			grade = 7;
		} else if (hardness > 50 || carContent < 0.7 || tenStrength > 5600) {
			grade = 6;
		} else {
			grade = 5;
		}
		
		System.out.println("The grade of the steel is : " + grade);
		
		kb.close();
	}

}
