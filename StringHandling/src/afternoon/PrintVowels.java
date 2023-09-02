package afternoon;

public class PrintVowels {

	public static void checkVowels(String a) {

		char ch;
		System.out.println("Vowels are :");
		for (int i = 0; i < a.length(); i++) {
			ch = a.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch);
			}

		}

	}

	public static void main(String[] args) {
		String s1 = "Welcome";
		checkVowels(s1);

	}

}
