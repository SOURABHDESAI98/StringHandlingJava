package lab;

import java.util.Scanner;

public class Assignment17 {

	public static String findOccurances(String a, char ch) {

		System.out.println("character " + ch + " is removed !!");
		for (int i = 0; i < a.length() - 1; i++) {

			if (ch == a.charAt(i)) {
				a = a.substring(0, i) + a.substring(i + 1);

			}

		}
		return a;

	}

	public static void main(String[] args) {
		String a = "  i live in country named india ";

		Scanner sc = new Scanner(System.in);
		System.out.println(a);
		System.out.println("Enter chatacter to remove from above string :");
		char ch = sc.next().charAt(0);
		sc.close();
		a = findOccurances(a, ch);
		System.out.println(a);

	}

}
