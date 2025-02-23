package basic.java.programs;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// Create a Scanner object to read user input
		Scanner input = new Scanner(System.in);

		// Ask the user to input the height
		System.out.print("Enter the height of the Rectangle: ");
		double height = input.nextDouble();

		// Ask the user to input the width
		System.out.print("Enter the width of the Rectangle: ");
		double width = input.nextDouble();

		// Close the scanner to prevent resource leak
		input.close();

		// Calculate the area using the formula A = h * w
		double area = height * width;

		// Output the result
		System.out.println("The area of the rectangle with height value " + height + " and width " + width + " is: " + area);

	}

}
