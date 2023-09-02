package afternoon;

public class StringMethods {

	public static void main(String[] args) {

		// indexOf(), lastIndexOf()
		String s1 = "i live in the country named india";

		int b = s1.indexOf('i', 3);
		System.out.println(b);

		int c = s1.lastIndexOf('i');
		System.out.println(c);

		int d = s1.indexOf('i');
		System.out.println(d);

		int a = s1.lastIndexOf('i', 25);
		System.out.println(a);

		// printing characters

		String s2 = "i love my india";

		for (int i = 0; i < s2.length(); i++) {

			System.out.println(s2.charAt(i));

		}

		s2 = s2.toUpperCase();

		for (int i = 0; i < s2.length(); i++) {

			System.out.println(s2.charAt(i));

		}

		// printing asciiValues char

		int asciiValue;

		for (int i = 0; i < s2.length(); i++) {

			asciiValue = s2.charAt(i);

			System.out.println(asciiValue);

		}

	}

}
