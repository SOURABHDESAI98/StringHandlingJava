package afternoon;

import java.util.Scanner;

public class PrintAlternateChar {

	public static void printAlternateChar(String a) {

		String b = "";

		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) != ' ') {
				b += a.charAt(i);
			}
		}

		System.out.println("Alternate characters :");
		for (int i = 0; i < b.length(); i++) {

			if (i % 2 == 0) {
				System.out.print(b.charAt(i) + " ");
			}
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input your full name :");
		String input = sc.nextLine();
		sc.close();
		input = input.trim();
		printAlternateChar(input);

	}

}
