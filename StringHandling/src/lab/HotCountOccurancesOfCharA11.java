package lab;

public class HotCountOccurancesOfCharA11 {

	public static void findOccurances(String a, char ch) {
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == ch) {
				count++;
			}
		}

		System.out.println("Character " + ch + " occurred " + count + " times");

	}

	public static void main(String[] args) {
		String a = "  i live in country name india";
		char ch = 'i';
		findOccurances(a, ch);

	}

}
