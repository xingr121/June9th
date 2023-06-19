package Class3;

import java.util.Scanner;

public class Activity30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the hours required: ");
		double timeRequired = kb.nextDouble();
		
		if ( timeRequired > 2 && timeRequired <=3) {
			System.out.println(" The worker is hightly effient.");
		} else if (timeRequired >=3 && timeRequired <4) {
			System.out.println(" The worker needs to improve speed.");
		} else if (timeRequired >=4 && timeRequired <5) {
			System.out.println(" The worker needs training to improve his speed.");
		} else {
			System.out.println(" The worker needs to leave the company.");
		}
		
		kb.close();
	}

}
