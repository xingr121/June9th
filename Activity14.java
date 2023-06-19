package Class3;

import java.util.Scanner;

public class Activity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the cost price: ");
		double costPrice = kb.nextDouble();
		System.out.println("Enter the selling price: ");
		double sellingPrice = kb.nextDouble();
		
		 if (sellingPrice > costPrice) {
	            double profit = sellingPrice - costPrice;
	            System.out.println("Profit: " + profit);
	        } else if (sellingPrice < costPrice) {
	            double loss = costPrice - sellingPrice;
	            System.out.println("Loss: " + loss);
	        } else {
	            System.out.println("No profit or loss.");
	        }
		 kb.close();
	}

}
