package afternoon;

import java.util.Scanner;

public class HotStringPatterns {

	public static void pattern1(String a) {
		char ch;
		String b = a.charAt(0) + ".";

		for (int i = 0; i < a.length(); i++) {

			ch = a.charAt(i);

			if (ch == ' ') {
				b += a.charAt(i + 1) + ".";
			}
		}

		System.out.println("pattern1 :" + b);

	}

	public static void pattern2(String a) {
		char ch;
		String b = a.charAt(0) + ".";
		boolean flag1 = true;
		boolean flag2 = false;
		int count = 0;

		for (int i = 0; i < a.length(); i++) {

			ch = a.charAt(i);

			if (flag2) {
				b += a.charAt(i);
				continue;
			}

			if (flag1) {
				if (ch == ' ') {
					count++;

					if (count == 2) {
						flag2 = true;
						flag1 = false;
						continue;
					}

					b += a.charAt(i + 1) + ".";
				}
			}

		}

		System.out.println("pattern2 :" + b);
	}

	public static void pattern3(String a) {
		char ch;
		String b = null;
		int count = 0;

		for (int i = 0; i < a.length(); i++) {

			ch = a.charAt(i);

			if (ch != ' ') {
				continue;
			} else {

				count++;

			}

			if (count == 2) {
				b = a.substring(i + 1) + " " + a.substring(0, i);

				break;
			}

		}

		System.out.println("pattern3 :" + b);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input your full name :");
		String name = sc.nextLine();
		sc.close();
		name = name.trim();
		pattern1(name);
		System.out.println();
		pattern2(name);
		System.out.println();
		pattern3(name);

	}

}
