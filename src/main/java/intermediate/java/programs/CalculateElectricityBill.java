package intermediate.java.programs;

import java.util.Scanner;

public class CalculateElectricityBill {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter current reading: ");
		int currentReading = input.nextInt();

		double billAmount = calculateBill(currentReading);

		System.out.println("Electricity Bill: " + billAmount + " rupees");

		input.close();
	}

	public static double calculateBill(int units) {
		double bill = 0;
		double taxRate = 0.25;
		double serviceCharge = 0;

		double priceUpTo30 = 44.86;
		double priceUpTo60 = 49.89;
		double priceUpTo120 = 51.95;
		double priceUpTo180 = 52.60;
		double priceAbove180 = 59.95;

		if (units <= 30) {
			bill = units * priceUpTo30;
			serviceCharge = 50;
		} else if (units <= 60) {
			bill = 30 * priceUpTo30 + (units - 30) * priceUpTo60;
			serviceCharge = 100;
		} else if (units <= 120) {
			bill = 30 * priceUpTo30 + 30 * priceUpTo60 + (units - 60) * priceUpTo120;
			serviceCharge = 120;
		} else if (units <= 180) {
			bill = 30 * priceUpTo30 + 30 * priceUpTo60 + 60 * priceUpTo120 + (units - 120) * priceUpTo180;
			serviceCharge = 130;
		} else {
			bill = 30 * priceUpTo30 + 30 * priceUpTo60 + 60 * priceUpTo120 + 60 * priceUpTo180
					+ (units - 180) * priceAbove180;
			serviceCharge = 150;
		}

		// Add tax
		bill += units * taxRate;

		// Add service charge
		bill += serviceCharge;

		return bill;

	}

}
