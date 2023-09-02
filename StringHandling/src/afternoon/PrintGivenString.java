package afternoon;

import java.util.Scanner;

public class PrintGivenString {

	public static void printInput(String a) {

		String b = "";
		for (int i = 0; i < a.length(); i++) {

			b += a.charAt(i) + " ";
			System.out.println(b);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input your full name :");
		String input = sc.nextLine();
		sc.close();
		input = input.trim();
		printInput(input);

	}

}
