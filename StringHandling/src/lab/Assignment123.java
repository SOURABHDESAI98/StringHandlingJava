package lab;

public class Assignment123 {

	public static void main(String[] args) {

		// assignment 1
		String a = "Welcome";
		String b = new String("Welcome");

		// assignment2

		String c = "hello";
		String d = "hello";
		System.out.println(c == d);// same reference in scp

		// assignment3
		String e = new String("Hello");
		String f = new String("Hello");
		System.out.println(e == f);// difference reference in heap

	}

}
