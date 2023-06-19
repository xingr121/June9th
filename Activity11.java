package Class3;

import java.util.Scanner;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double side1 , side2 , side3;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Give me sides of a triangle: ");
		side1 = kb.nextInt();
		side2 = kb.nextInt();
		side3 = kb.nextInt();
		
		if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
			System.out.println("valid");
		}else {
			System.out.println("not valid");
		}
		 kb.close();
	}

}
