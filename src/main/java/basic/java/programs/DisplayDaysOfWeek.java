package basic.java.programs;

import java.util.Scanner;

public class DisplayDaysOfWeek {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int Day = input.nextInt();
		String Plans = input.next();

		switch (Day) {
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednsday");
		case 4 -> System.out.println("Thursday");
		case 5 -> System.out.println("Friday");
		case 6 -> System.out.println("Saturday");
		case 7 -> {		
			System.out.println("Sunday");
			switch(Plans) {
			case "Stay"  -> System.out.println("Happy Reset Day!");
			default -> System.out.println(":)");
			}
		}
		default -> System.out.println("Enter a Valid Day");
		}
		
//		switch(Day) {
//		
//		case 1,2,3,4,5 -> System.out.println("Weekday");
//		case 6,7 -> System.out.println("Weekend");
//		}

	}

}
