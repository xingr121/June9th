package Class3;

import java.util.Scanner;

public class Activity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner kb = new Scanner(System.in);
     
     System.out.println("Enter the mark of Physics: ");
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
     
     char grade;
     
     if (percentage >= 90) {
         grade = 'A';
     } else if (percentage >= 80) {
         grade = 'B';
     } else if (percentage >= 70) {
         grade = 'C';
     } else if (percentage >= 60) {
         grade = 'D';
     } else if (percentage >= 40) {
         grade = 'E';
     } else {
         grade = 'F';
     }
     
     System.out.println("Percentage: " + percentage + "%");
     System.out.println("Grade: " + grade);
     
     kb.close();
     
	}

}
