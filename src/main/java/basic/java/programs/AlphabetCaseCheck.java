package basic.java.programs;

import java.util.Scanner;

public class AlphabetCaseCheck {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		char ch = in.next().trim().charAt(0);
		// trim trailing space removed
		System.out.println(ch);

		if (ch >= 'a' && ch <= 'z') {
			
			System.out.println("Lowercase");
		}else {
			System.out.println("Uppercase");
		}
		

	}

}
