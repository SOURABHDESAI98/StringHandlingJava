package afternoon;

public class HotFindNoOfWords {

	public static void findNoOfWords(String a) {

		int count = 0;
		char ch1, ch2;
		for (int i = 0; i < a.length() - 1; i++) {
			ch1 = a.charAt(i);
			ch2 = a.charAt(i + 1);

			if (ch1 == ' ' && ch2 != ' ') {
				count++;
			}

		}

		System.out.println("No of words " + (count + 1));

	}

	public static void main(String[] args) {
		String a = "  i live in country name india ";
		a = a.trim();
		findNoOfWords(a);

	}
}
