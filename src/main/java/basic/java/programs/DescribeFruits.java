package basic.java.programs;

import java.util.Scanner;

public class DescribeFruits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String fruits = input.next();

		switch (fruits) {
		case "Mango":
			System.out.println("Tasty");
			break;
		case "Dooriyan":
			System.out.println("Ewwww");
			break;
		case "Banana":
			System.out.println("tsk Nice");
			break;
		default:
			System.out.println("Enter a mentioned fruit");
			break;
		}
		
//	      switch (fruits) {
//           case "Mango" -> System.out.println("Tasty");
//           case "Dooriyan" -> System.out.println("Eww");
//           case "Banana" -> System.out.println("Tsk Nice");
//           default -> System.out.println("Enter a mentioned fruit");
//       }

	}

}
