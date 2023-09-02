package afternoon;

public class StringInternMethod {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = new String("Hello");
		System.out.println(s1 == s2);
		String s3 = s2.intern(); // it copies object present in heap into SCP to save memory
		System.out.println(s1 == s3);

		// comparision
		System.out.println(s1.equals(s3));
		System.out.println(s1.intern().equals(s3.intern()));// this is faster

	}

}
