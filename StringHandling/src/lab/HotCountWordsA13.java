package lab;

public class HotCountWordsA13 {
	public static void findNoOfWords(String a) {

		int count = 0;
		for (int i = 0; i < a.length() - 1; i++) {
			if (a.charAt(i) == ' ' && a.charAt(i + 1) != ' ') {

				count++;
			}

		}

		System.out.println("No of words " + (count + 1));

	}

	public static void main(String[] args) {
		String a = "  i live in country name india  ";
		findNoOfWords(a.strip());

	}

}
