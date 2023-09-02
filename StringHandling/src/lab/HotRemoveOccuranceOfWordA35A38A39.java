package lab;

public class HotRemoveOccuranceOfWordA35A38A39 {

	public static void removeFirstOccurrenceOfWord(String a) {

		String str;
		char ch;

		// first occurrence of word
		int b = a.indexOf("india");
		System.out.println("First occurrence of word is at index  " + b);

		// removing first occurrence of word
		for (int i = b; i < a.length(); i++) {
			ch = a.charAt(i);
			if (ch == ' ') {
				str = a.substring(0, b) + "---" + a.substring(i + 1);
				System.out.println(str);
				break;
			}

		}

		System.out.println();

	}

	public static void removeLastOccurenceOfWord(String a) {

		String str;
		char ch;

		// last occurrence of word
		int c = a.lastIndexOf("india");
		System.out.println("Last occurrence of word is at index " + c);

		// removing first occurrence of word
		for (int i = c; i < a.length(); i++) {
			ch = a.charAt(i);
			if (ch == ' ') {
				str = a.substring(0, c) + "---" + a.substring(i + 1);
				System.out.println(str);
				break;
			}

		}

	}

	public static void main(String[] args) {

		String a = "india is my country, india is beautiful";
		removeFirstOccurrenceOfWord(a);
		removeLastOccurenceOfWord(a);

	}

}
