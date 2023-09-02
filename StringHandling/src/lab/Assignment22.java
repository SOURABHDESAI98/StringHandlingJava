package lab;

public class Assignment22 {

	public static void countVowels(String a) {

		int count1 = 0;
		int count2 = 0;
		char ch;

		for (int i = 0; i < a.length(); i++) {
			ch = a.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count1++;
			} else {
				count2++;
			}
		}
		System.out.println("No of vowels :" + count1);
		System.out.println("No of consonents :" + count2);
	}

	public static void main(String[] args) {

		String a = "india is my country";
		countVowels(a);

	}

}
