package Class3;

import java.util.Scanner;

public class Activity27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of a rectangle: ");
		double length = kb.nextDouble();
		System.out.println("Enter the breadth of a rectangle: ");
		double breadth = kb.nextDouble();
		
		double area = length * breadth;
		double perimeter = (length + breadth) * 2;
		
		if (area > perimeter) {
			System.out.println("The area of the rectangle is greater than its perimeter.");
		} else {
			System.out.println("The area of the rectangle is not greater than its perimeter.");
		}
		kb.close();
	}

}
