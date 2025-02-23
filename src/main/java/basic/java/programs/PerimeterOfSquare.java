package basic.java.programs;

import java.util.Scanner;

public class PerimeterOfSquare {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Ask for the square length
		System.out.print("Enter the length of the square: ");
		double length = input.nextDouble();

		double perimeter = length * 4;

		System.out.println("Perimeter of the given Length " + length + " square is: " + perimeter);

	}

}
