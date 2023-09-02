package lab;

public class Assignment26 {

	public static void findHighestFrequencyCount(String a) {

		int count;
		int max = 0;
		char ch;
		String b = "";

		System.out.println("Frequency of each character is :");
		for (int i = 0; i < a.length() - 1; i++) {
			count = 0;
			ch = a.charAt(i);

			for (int j = 1; j < a.length(); j++) {
				if (ch == a.charAt(j)) {
					count++;
					a = a.substring(0, j) + a.substring(j + 1);
				}
				if (i == 0) {
					max = count;
				}
				if (count > max) {
					max = count;
					b = ch + " ";

				}
			}

			if (ch != ' ') {
				System.out.println(ch + ":" + count);
			}

		}
		System.out.println("Maximum frequency is " + max + " of character " + b);

	}

	public static void main(String[] args) {
		String a = "india is my country";
		findHighestFrequencyCount(a);

	}

}
