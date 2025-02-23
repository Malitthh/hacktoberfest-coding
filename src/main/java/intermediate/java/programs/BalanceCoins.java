package intermediate.java.programs;

import java.util.Scanner;

public class BalanceCoins {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the cash amount: ");
		int cash = input.nextInt();

		int balance = cash;

		// Check if the balance is less than or equal to 20
		while (balance <= 20) {
			System.out.println("Balance: " + balance);
			System.out.println("Coins returned:");

			int numCoins = 0;

			// Using 5 Rs coins
			if (balance >= 5) {
				int fives = balance / 5;
				numCoins += fives;
				balance = balance % 5;
				System.out.println(fives + " x 5 Rs coins");
			}

			// Using 2 Rs coins
			if (balance >= 2) {
				int twos = balance / 2;
				numCoins += twos;
				balance = balance % 2;
				System.out.println(twos + " x 2 Rs coins");
			}

			// Using 1 Rs coins
			if (balance >= 1) {
				int ones = balance / 1;
				numCoins += ones;
				balance = balance % 1;
				System.out.println(ones + " x 1 Rs coins");
			}

			System.out.println("Total coins returned: " + numCoins);
			break; // Exit the loop after handing over coins
		}

		if (balance > 20) {
			System.out.println("Balance is greater than 20, no coins returned.");
		}

		input.close();
	}
}
