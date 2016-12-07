package extras;

public class ObjectReference {
	int a, b;
	String s;

	ObjectReference() {
		a = 10;
		b = 20;
	}

	public void print() {
		System.out.println("a = " + a + " b = " + b + "\n");
	}

	public static void main(String[] args) {
		ObjectReference obj1 = new ObjectReference();
		ObjectReference obj2 = obj1;// obj2 -----> obj1

		obj1.a = obj1.a + 1;
		obj1.b = obj1.b + 1;
		obj1.s = "Hello";

		System.out.println("values of obj1 : ");
		obj1.print();
		System.out.println("values of obj2 : ");
		obj2.print();

		System.out.println(obj2.s);

	}
}

/*
 * 
 * Assignment of obj2 to obj1 makes obj2 a reference to obj1. Therefore, any
 * change in obj1 will be reflected in obj2 also.
 */
