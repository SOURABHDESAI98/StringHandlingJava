package lab;

public class Assignment14 {

	public static void countWords(String a) {

		char ch;
		int count = 0;

		for (int i = 0; i < a.length(); i++) {
			ch = a.charAt(i);
			if (Character.isAlphabetic(ch)) {
				count++;

				if (count == 1) {
					System.out.println("word occurred at index " + i + " for the first time");
				}
			}
		}

	}

	public static void main(String[] args) {
		String a = " \r \b \n i live in \r india";

		countWords(a);

	}

}
