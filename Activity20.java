package Class3;

import java.util.Scanner;

public class Activity20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the basic salary: ");
		double basicSalary = kb.nextDouble();
		
		double hra = 0;
		double da = 0;
		
		if (basicSalary < 1500) {
		    hra = 0.1 * basicSalary;
		    da = 0.9 * basicSalary;
		} else if (basicSalary >= 1500) {
		            hra = 500;
		            da = 0.98 * basicSalary;
	    }
			 
		double grossSalary = basicSalary + hra + da;

		System.out.println("Gross Salary: " + grossSalary);

		        kb.close();
	}

}
