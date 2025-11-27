//Sai Katkar
//September 16, 2025

import java.util.Scanner;

public class SoftwarePackage {
	
	public static final int PRICE = 99;
	
	
	public static void main(String[] args) {
		
		
		Scanner Key = new Scanner(System.in);
		
		//Input for total number of software packages ordered
		System.out.println("Enter the total amount of software packages ordered:");
		int numPackages = Key.nextInt();
		
		
		//Checks if the value entered is valid
		if (numPackages <= 0 ) {
			System.out.println("Invalid value for package count! Exiting the program!");
			System.exit(0);
		}
		
		//Total amount without discount 
		double totalBill = PRICE * numPackages;
		
		System.out.println("Total Bill Amount(before discount) = $"+totalBill);
		
		double discount;
		
		//Calculating the discount based on number of packages
		if(numPackages>= 10 && numPackages<= 19) {
			discount = totalBill * 0.20;
		}
		else if(numPackages>= 20 && numPackages<= 49){
			discount = totalBill * 0.30;
		}
		else if(numPackages>= 50 && numPackages<= 99){
			discount = totalBill * 0.40;
		}
		else {
			discount = totalBill * 0.50;
		}
		
		//Displaying amount of discount
		System.out.println("Amount of discount = $"+discount);
		
		//Calculating the total bill after discount
		double amountAfterDiscount = totalBill - discount;
		
		//Displaying the total bill after discount
		System.out.println("Total Bill Amount (after discount)= $"+ amountAfterDiscount);
		
		
	}

}
