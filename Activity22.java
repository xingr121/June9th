package Class3;

import java.util.Scanner;

public class Activity22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

        System.out.print("Enter the gender (Male/Female): ");
        String gender = kb.next();

        System.out.print("Enter the years of service: ");
        int yearsOfService = kb.nextInt();

        System.out.print("Enter the qualifications (Post-Graduate/Graduate): ");
        String qualifications = kb.next();

        int salary = 0;

        if (gender.equalsIgnoreCase("Male")) {
            if (yearsOfService >= 10) {
                if (qualifications.equalsIgnoreCase("Post-Graduate")) {
                    salary = 15000;
                } else if (qualifications.equalsIgnoreCase("Graduate")) {
                    salary = 10000;
                }
            } else {
                if (qualifications.equalsIgnoreCase("Post-Graduate")) {
                    salary = 10000;
                } else if (qualifications.equalsIgnoreCase("Graduate")) {
                    salary = 7000;
                }
            }
        } else if (gender.equalsIgnoreCase("Female")) {
            if (yearsOfService >= 10) {
                if (qualifications.equalsIgnoreCase("Post-Graduate")) {
                    salary = 12000;
                } else if (qualifications.equalsIgnoreCase("Graduate")) {
                    salary = 9000;
                }
            } else {
                if (qualifications.equalsIgnoreCase("Post-Graduate")) {
                    salary = 10000;
                } else if (qualifications.equalsIgnoreCase("Graduate")) {
                    salary = 6000;
                }
            }
        }

        System.out.println("The calculated salary is: " + salary);
        
        kb.close();
	}

}
