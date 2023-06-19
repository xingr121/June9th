package Class3;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		
		double carrotsPrice = 2.0;
        double onionsPrice = 4.0;
        double meatPrice = 10.0;

        System.out.println("Enter the number of pounds of carrots: ");
        double carrotsQuantity = kb.nextDouble();

        System.out.println("Enter the number of pounds of onions: ");
        double onionsQuantity = kb.nextDouble();

        System.out.println("Enter the number of pounds of meat: ");
        double meatQuantity = kb.nextDouble();

        double totalCost = (carrotsPrice * carrotsQuantity) + (onionsPrice * onionsQuantity) + (meatPrice * meatQuantity);

        System.out.println("You want to pay by cash or card? ");
        String paymentMethod = kb.next();

        if (paymentMethod.equalsIgnoreCase("card")) {
            double taxAmount = totalCost * 0.13;
            totalCost += taxAmount;
        }

        System.out.println("Total amount to be paid: $" + totalCost);
	}

}
