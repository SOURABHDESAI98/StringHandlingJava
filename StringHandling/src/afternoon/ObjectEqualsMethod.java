package afternoon;

class Laptop {

	String name;
	int price;

	public Laptop(String name, int price) {

		this.name = name;
		this.price = price;
	}

	// overidden from Object class

	public boolean equals(Laptop lp) {
		return this.name.equals(lp.name) && this.price == lp.price;

	}

}

public class ObjectEqualsMethod {

	public static void main(String[] args) {

		Laptop l1 = new Laptop("Dell", 500000);
		Laptop l2 = new Laptop("Dell", 500000);

		System.out.println(l1 == l2); // false

		System.out.println(l1.equals(l2)); // true

	}

}
