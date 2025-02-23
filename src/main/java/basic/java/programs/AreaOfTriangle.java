package basic.java.programs;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Ask the user to input the base value
        System.out.print("Enter the base value of the triangle: ");
        double baseValue = input.nextDouble();
        
        // Ask the user to input the height
        System.out.print("Enter the height of the triangle: ");
        double height = input.nextDouble();

        // Close the scanner to prevent resource leak
        input.close();

        // Calculate the area using the formula A = 1/2 * baseValue* height	
        double area = 0.5 * baseValue * height;

        // Output the result
        System.out.println("The area of the triangle with base value " + baseValue +"and height " + height +"is: " + area);

	}

}
