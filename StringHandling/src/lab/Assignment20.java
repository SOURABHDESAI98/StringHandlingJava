package lab;

public class Assignment20 {

	public static String removeExtraBlankSpaces(String a) {

		for (int i = 0; i < a.length() - 1; i++) {

			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ') {
				a = a.substring(0, i + 1) + a.substring(i + 2);

			}

		}
		return a;

	}

	public static void main(String[] args) {
		String a = "  i live in  country  named  india ";

		a = removeExtraBlankSpaces(a);
		System.out.println(a);

	}
}
