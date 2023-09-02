package lab;

public class Assignment23 {
	public static void reverseString(String a) {

		String b = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			b += a.charAt(i);
		}

		if (b.equals(a)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

	public static void main(String[] args) {
		String a = "madam";
		reverseString(a);
	}

}
