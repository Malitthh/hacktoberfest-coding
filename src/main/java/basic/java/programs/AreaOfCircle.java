package basic.java.programs;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// Predefined value of pi
		double pi = Math.PI;

		// Create a Scanner object to read user input
		Scanner input = new Scanner(System.in);

		// Ask the user to input the radius
		System.out.print("Enter the radius of the circle: ");
		double radius = input.nextDouble();

		// Close the scanner to prevent resource leak
		input.close();

		// Calculate the area using the formula A = pi * r * r
		double area = pi * radius * radius;

		// Output the result
		System.out.println("The area of the circle with radius " + radius + " is: " + area);

	}

}
