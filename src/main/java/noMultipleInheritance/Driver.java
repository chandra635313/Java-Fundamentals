package noMultipleInheritance;

/*
 * B -> A
 * C -> B
 * */
public class Driver {

	public static void main(String[] args) {
		A c = new C();
		c.print(); // Output: Hello B

		A b = new B();
		b.print(); // Output: Hello B (method overridden)
	}

}
