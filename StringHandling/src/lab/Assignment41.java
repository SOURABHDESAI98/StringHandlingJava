package lab;

public class Assignment41 {

	public static void findAlpahbets(String a) {
		int count = 0;
		char ch;

		for (int i = 0; i < a.length(); i++) {
			ch = a.charAt(i);
			if (Character.isAlphabetic(ch)) {
				count++;
			}

		}
		System.out.println("Total number of alpahabets :" + count);

	}

	public static void findDigits(String a) {

		int count = 0;
		char ch;

		for (int i = 0; i < a.length(); i++) {
			ch = a.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println("Total number of digits :" + count);

	}

	public static void findSpecialChar(String a) {

		int count = 0;
		char ch;

		for (int i = 0; i < a.length(); i++) {
			ch = a.charAt(i);
			if (Character.isDigit(ch) || Character.isAlphabetic(ch) || Character.isWhitespace(ch)) {

			} else {
				count++;
			}
		}

		System.out.println("Total number of special character :" + count);

	}

	public static void main(String[] args) {

		String a = "india % & 4 is my country, 9 india is 88 @  great @";
		findAlpahbets(a);
		findDigits(a);
		findSpecialChar(a);
		boolean b = true;
		System.out.println(String.valueOf(b));

	}

}
