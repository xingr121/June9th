package Class3;

import java.util.Scanner;

public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the quantity purchased: ");
		int quantity = kb.nextInt();
		
		System.out.println("Enter the price per item: ");
		double pricePerItem = kb.nextDouble();
		
		double totalExpense;
		
		if (quantity > 100) {
			double discount = 0.10 * quantity * pricePerItem;
			totalExpense = quantity * pricePerItem - discount;
		} else {
			totalExpense = quantity * pricePerItem;
		}
		
		System.out.println("Total Expense: " + totalExpense);
		
		kb.close();
	}

}
