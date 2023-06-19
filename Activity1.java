package Class3;

import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner kb = new Scanner(System.in);
       System.out.println("Please give a number:");
       
       double num = kb.nextDouble();
       
       if (num < 0) {
    	   System.out.println("this number is negative");
       }else { 
    	   System.out.println("this number is positive");
       }
       kb.close();
	}

}
