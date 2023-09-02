package afternoon;

import java.util.Arrays;

public class HotSameLengthStringArray {

	public static void makeSameLength(String a[]) {

		String b = "";
		String c = "";
		char ch;

		for (String n : a) {

			b += n;
		}

		int index = b.length() / a.length;

		for (int i = 0; i < b.length(); i++) {
			ch = b.charAt(i);

			if (i % index == 0 && i != 0) {
				c = c + " ";

			}
			c = c + ch;

		}

		a = c.split(" ");
		b = a[a.length - 1];
		int d = b.length() - index;

		if (d < 0) {
			for (; d < 0; d++) {

				b = b + '#';
			}
			a[a.length - 1] = b;
		}

		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {

		String a[] = { "i", "like", "programming" };
		// String a[] = { "i", "am", "smarttthigigh" };

		makeSameLength(a);

	}

}
