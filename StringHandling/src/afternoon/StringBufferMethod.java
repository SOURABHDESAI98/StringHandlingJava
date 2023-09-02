package afternoon;

public class StringBufferMethod {

	public static void main(String[] args) {

		// string mutation can be done by stringbuffer or stringbuilder

		// right way to initialize
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer("Hello igiugc gigigh");

		// can not initialize like this- StringBuffer sb="Hello"

		String s1 = new String(sb1);// passing string buffer as parameter to string

		String str = "hey";
		StringBuffer sb4 = new StringBuffer(str);// passing string as parameter to string buffer

		// capacity check
		// if content gets bigger than capacity then, new capacity=(old capacity*2)+2

		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.capacity());
		sb2.append("hello");
		System.out.println(sb2.capacity());
		sb2.append("hoifhf alf ls zsh");
		System.out.println(sb2.capacity());
		sb2.append("me ieafoifv iwavnoaiu");
		System.out.println(sb2.capacity());

		System.out.println(sb.capacity()); // 16

		System.out.println(sb1.capacity());

		// you don't need to give reference variable to store output of methods like
		// string
		sb.append("hello world and universe");
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);
		sb.insert(2, "Yes");
		System.out.println(sb);

		// replacing characters
		sb.replace(2, 5, "Yes");
		System.out.println(sb);

		s1.replace('o', 'd');
		System.out.println(sb);

	}

}
