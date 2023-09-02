package lab;

public class A32A33 {

	public static void main(String[] args) {
		String a = "india is my country";
		int c = a.indexOf('i');
		String str = a.substring(0, c) + a.substring(c + 1);
		// first occurrence is removed
		System.out.println(str);
		int d = a.lastIndexOf('i');
		str = a.substring(0, d) + a.substring(d + 1);
		// last occurrence is removed
		System.out.println(str);

	}

}
