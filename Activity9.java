package Class3;

import java.util.Scanner;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = kb.nextInt();

        int notesCount = 0;

        if (amount >= 1000) {
            notesCount += amount / 1000;
            amount %= 1000;
        }

        if (amount >= 500) {
            notesCount += amount / 500;
            amount %= 500;
        }

        if (amount >= 100) {
            notesCount += amount / 100;
            amount %= 100;
        }

        if (amount >= 50) {
            notesCount += amount / 50;
            amount %= 50;
        }

        if (amount >= 20) {
            notesCount += amount / 20;
            amount %= 20;
        }

        if (amount >= 10) {
            notesCount += amount / 10;
            amount %= 10;
        }

        if (amount >= 5) {
            notesCount += amount / 5;
            amount %= 5;
        }

        if (amount >= 2) {
            notesCount += amount / 2;
            amount %= 2;
        }

        if (amount >= 1) {
            notesCount += amount;
        }

        System.out.println("Total number of notes: " + notesCount);
        
        kb.close();
	}

}
