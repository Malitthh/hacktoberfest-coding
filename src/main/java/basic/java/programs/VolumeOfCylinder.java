package basic.java.programs;

import java.util.Scanner;

public class VolumeOfCylinder {

	public static void main(String[] args) {

		// Predefined value of pi
		double pi = Math.PI;

		Scanner input = new Scanner(System.in);
		
		// Ask the user to input the radius
		System.out.print("Enter the radius of the cylinder: ");
		double radius = input.nextDouble();
		
		// Ask the user to input the height
		System.out.print("Enter the height of the cylinder: ");
		double height = input.nextDouble();
		
		// Close the scanner to prevent resource leak
		input.close();

		// Calculate the area using the formula A = pi * r * r * h
		double volume = pi * radius * radius * height;
		
		System.out.println("Volume of the given Cylinder is: " +volume);
	}

}
