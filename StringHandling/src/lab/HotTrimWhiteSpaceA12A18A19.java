package lab;

public class HotTrimWhiteSpaceA12A18A19 {

	public static void main(String[] args) {

		String a = " \r 1\n 2 /n i live in country named india \n ";
		System.out.println(a);

		System.out.println(a.trim());// removes both leading and trailing white space characters
		System.out.println(a.strip());// same as trim
		System.out.println(a.stripLeading());// removes only leading white space characters
		System.out.println(a.stripTrailing());// removes only trailing white space characters
	}

}
