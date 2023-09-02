package afternoon;

public class SortingString {

	public static void sortingString(String a) {

		String str[] = a.split(" ");
		String temp;

		for (int i = 0; i < str.length; i++) {

			for (int j = 0; j < str.length - 1; j++) {

				if (str[j].compareTo(str[j + 1]) > 0) {

					temp = str[j + 1];
					str[j + 1] = str[j];
					str[j] = temp;

				}

			}

		}

		for (String s : str) {

			System.out.print(s + " ");

		}

	}

	public static void main(String[] args) {
		String a = "india is my country, india is great";
		sortingString(a);

	}

}
