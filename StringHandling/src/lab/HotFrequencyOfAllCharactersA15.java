package lab;

public class HotFrequencyOfAllCharactersA15 {

	public static void findOccurances(String a) {
		int count;
		char ch[] = a.toCharArray();
		char ch1;
		System.out.println("Frequency of characters :");
		for (int i = 0; i < ch.length - 1; i++) {
			count = 1;
			ch1 = ch[i];
			if (ch1 == '@' || ch1 == ' ') {
				continue;
			}

			for (int j = i + 1; j < ch.length; j++) {
				if (ch1 == ch[j]) {
					count++;
					ch[j] = '@';
				}
			}
			System.out.println(ch1 + ":" + count);

		}

	}

	public static void main(String[] args) {
		String a = "  i live in country  name  india";
		findOccurances(a.trim());

	}

}
