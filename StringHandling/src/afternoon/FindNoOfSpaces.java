package afternoon;

public class FindNoOfSpaces {

	public static void findNoOfSpaces(String a) {
		char ch;
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			ch = a.charAt(i);
			if (ch == ' ') {
				count++;
			}
		}
		System.out.println("No of spaces :" + count);

	}

	public static void main(String[] args) {

		String a = "  i live in  country name india";
		findNoOfSpaces(a);
	}

}
