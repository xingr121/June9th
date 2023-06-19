package Class3;

import java.util.Scanner;

public class Activity24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
	     
	     System.out.println("Enter the age of Ram : ");
	     int ramAge = kb.nextInt();

	     System.out.print("Enter the age of Shayam: ");
	     int shayamAge = kb.nextInt();

	     System.out.print("Enter the age of Ajay: ");
	     int ajayAge = kb.nextInt();
	     
	     int youngestAge;
	     
	     if (ramAge < shayamAge) {
	    	 if (ramAge < ajayAge) {
	    		 System.out.print("Ram if the youngest.");
	    	 } else {
	    		 System.out.print("Ajay if the youngest.");
	    	 }
	     } else {
	    	 if (shayamAge < ajayAge) {
	    		 System.out.print("Shayam if the youngest.");
	    	 } else {
	    		 System.out.print("Ajay if the youngest.");
	    	 }
	     }
	     
	  kb.close();
	     
	     
	}

}
