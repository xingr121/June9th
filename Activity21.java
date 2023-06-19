package Class3;

import java.util.Scanner;

public class Activity21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
	     
	     System.out.println("Enter the marks in physics : ");
	     double physicsMark = kb.nextDouble();

	     System.out.print("Enter the marks of Chemistry: ");
	     double chemistryMarks = kb.nextDouble();

	     System.out.print("Enter the marks of Biology: ");
	     double biologyMarks = kb.nextDouble();

	     System.out.print("Enter the marks of Mathematics: ");
	     double mathematicsMarks = kb.nextDouble();

	     System.out.print("Enter the marks of Computer: ");
	     double computerMarks = kb.nextDouble();
	     
	     double totalMark = physicsMark + chemistryMarks + biologyMarks + mathematicsMarks + computerMarks;
	     double percentage = (totalMark / 500) * 100;
	     
	     String division = null;
	     
	     if (percentage >= 60) {
	         division = "First division";
	     } else if (percentage >= 50 && percentage < 60) {
	         division = "Second division";
	     } else if (percentage >= 40 && percentage <50) {
	         division = "Third division";
	     } else if (percentage < 40) {
	    	 division = "Fail";
	     }
	     
	     System.out.println("Percentage: " + percentage + "%");
	     System.out.println("division: " + division);
	     
	     kb.close();
	}

}
