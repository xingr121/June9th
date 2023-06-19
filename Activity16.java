package Class3;

import java.util.Scanner;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);

        System.out.println("Enter the basic salary: ");
        double basicSalary = kb.nextDouble();

        double hra;
        double da;

        if (basicSalary <= 10000) {
            hra = 0.2 * basicSalary;
            da = 0.8 * basicSalary;
        } else if (basicSalary <= 20000) {
            hra = 0.25 * basicSalary;
            da = 0.9 * basicSalary;
        } else {
            hra = 0.3 * basicSalary;
            da = 0.95 * basicSalary;
        }

        double grossSalary = basicSalary + hra + da;

        System.out.println("Gross Salary: " + grossSalary);

        kb.close();
	}

}
