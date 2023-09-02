package afternoon;

public class HotScpHeap {

	public static void main(String[] args) {

		// case1
		String s1 = "java";
		String s2 = "core";
		String s3 = new String("java");
		String s4 = new String("core");
		String out1 = s1 + s2;
		String out2 = s1.concat(s2);
		String out3 = "javacore";
		String out4 = "java" + s4;
		String out5 = out1.intern();

		System.out.println(out1 == out2);
		System.out.println(out1 == out4);
		System.out.println(out3 == out5);
		System.out.println();

		// case2

		String str1 = "myString";
		String str2 = str1.toLowerCase();// run time operation stores in heap
		System.out.println(str1 == str2);
		String str3 = "mystring";
		String str4 = str3.toLowerCase();// no object is created, reference of str3 is passed
		System.out.println(str3 == str4);
		String str5 = new String("mystring");
		System.out.println(str5 == str4);
	}

}
