package Class3;

import java.util.Scanner;

public class Activity25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double angle1 , angle2 , angle3;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Give me angles of a triangle: ");
		angle1 = kb.nextInt();
		angle2 = kb.nextInt();
		angle3 = kb.nextInt();
		
		if (angle1 + angle2 + angle3 == 180) {
			System.out.println("valid");
		}else {
			System.out.println("not valid");
		}
		 kb.close();
	}

}
