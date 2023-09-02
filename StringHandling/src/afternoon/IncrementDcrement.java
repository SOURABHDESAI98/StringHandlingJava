package afternoon;

public class IncrementDcrement {

	public static void main(String[] args) {

		// case1
		int i = 0;
		System.out.println(i++);
		System.out.println(++i);

		// case2
		int s = 0;
		int t = s++;
		int u = ++s;
		System.out.println(t);
		System.out.println(u);

		// case3
		int l = 0;
		int q = l++;
		System.out.println(l);
		System.out.println(q);

		// case4
		int c = 0;
		int d = c + 1; // increment decrement rules don't apply to addition
		System.out.println(d); // output is 1

	}

}
