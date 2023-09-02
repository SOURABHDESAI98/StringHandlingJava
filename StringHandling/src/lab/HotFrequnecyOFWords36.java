package lab;

public class HotFrequnecyOFWords36 {

	public static void occuranceOfWords(String a) {

		String b[] = a.split(" ");

		for (String n : b) {
			System.out.println(n);
		}

		int count;

		System.out.println("Frequency of each word :");

		for (int i = 0; i < b.length - 1; i++) {
			count = 1;

			if (b[i].equals("1")) {
				continue;
			}

			for (int j = 1; j < b.length; j++) {

				if (b[i].equals(b[j])) {
					count++;
					b[j] = "1";
				}
			}

			System.out.println(b[i] + ":" + count);
		}

	}

	public static void main(String[] args) {

		String a = "india is my country, india is great";
		occuranceOfWords(a);

	}

}
