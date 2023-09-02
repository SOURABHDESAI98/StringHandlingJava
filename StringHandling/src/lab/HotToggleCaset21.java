package lab;

public class HotToggleCaset21 {

	public static void toggleCae(String a) {

		String b;
		char ch;
		String c = "";

		for (int i = 0; i < a.length(); i++) {
			b = a.substring(i, i + 1);
			ch = a.charAt(i);
			if (Character.isLowerCase(ch)) {
				c += b.toUpperCase();
			} else {
				c += b.toLowerCase();
			}
		}

		System.out.println("Final output is " + c);
	}

	public static void main(String[] args) {
		String a = "SouRaBh";
		toggleCae(a);

	}

}
