package Class3;

import java.util.Scanner;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the electricity unit charges: ");
		int unitCharges = kb.nextInt();
		
		double billAmount;

        if (unitCharges <= 50) {
            billAmount = unitCharges * 0.50;
        } else if (unitCharges <= 200) {
            billAmount = (50 * 0.50) + ((unitCharges - 50) * 0.75);
        } else if (unitCharges <= 450) {
            billAmount = (50 * 0.50) + (150 * 0.75) + ((unitCharges - 200) * 1.20);
        } else {
            billAmount = (50 * 0.50) + (150 * 0.75) + (250 * 1.20) + ((unitCharges - 450) * 1.50);
        }

        double surcharge = billAmount * 0.20;
        double totalBillAmount = billAmount + surcharge;

        System.out.println("Total Electricity Bill: $ " + totalBillAmount);

        kb.close();
	}

}
