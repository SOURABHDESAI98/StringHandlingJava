package lab;

public class Assignment28 {

	public static void frequencyCount(String a) {

		int count;

		System.out.println("Frequency of each character is :");

		char ch;

		for (int i = 0; i < a.length() - 1; i++) {
			count = 0;
			ch = a.charAt(i);

			if (ch == ' ') {
				continue;
			}

			for (int j = 1; j < a.length(); j++) {
				if (ch == a.charAt(j)) {
					count++;
					a = a.substring(0, j) + a.substring(j + 1);
				}
			}

			System.out.println(ch + ":" + count);

		}

	}

	public static void main(String[] args) {
		String a = "india is my country";
		frequencyCount(a);

	}
}
