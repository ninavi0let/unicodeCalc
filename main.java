# unicodeCalc
Java Deliverable 2 Unicode Calculator

import java.util.Scanner;

public class unicodeCalc {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		String string1 = "";
		String string2 = "";
		int sum1 = 0;
		int sum2 = 0;
		int differenceOfSums = 0;

		// System.out.println("Enter the first line that you would like to unicode: ");
		string1 = scnr.next();
		char[] string1ToCharArray = string1.toCharArray();

		for (char letter : string1ToCharArray) {
			// char output = letter.charAt(0);
			int number = (int) letter;
			sum1 = sum1 + number;

			System.out.println(letter + ": " + number);

		}

		System.out.println("Enter the second line that you would like to unicode: ");
		string2 = scnr.next();
		char[] string2ToCharArray = string2.toCharArray();

		for (char letter : string2ToCharArray) {
			// char output = letter.charAt(0);
			int number = (int) letter;
			sum2 = sum2 + number;

			System.out.println(letter + ": " + number);

		}

		if (sum1 > sum2) {
			differenceOfSums = sum1 - sum2;
		} else {
			differenceOfSums = sum2 - sum1;
		}

		System.out.println("Absolute value: ");
		System.out.println(Math.abs(differenceOfSums));
	}
}
