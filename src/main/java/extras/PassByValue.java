package extras;

public class PassByValue {

	public static void main(String[] args) {

		// Passing Object
		Person p = new Person("John", 1);
		changePerson(p);
		System.out.println(p.getName());

		// Passing primitive
		int a = 2;
		changeNumber(a);
		System.out.println(a);
	}

	public static void changePerson(Person p) {
		p.setName("Adam");
	}

	public static void changeNumber(int a) {
		a = a + 2;
	}

}

/*
 * Primitive:In Java, primitive variables are always passed by value. A copy of
 * the variable is passed into the method. In other words, if you make a change
 * to the variable within the method, then that change is not visible anywhere
 * else.
 * 
 * Objects: Java passes the object reference ‘by value’. When an object is
 * passed as argument to a method, actually the reference to that
 * object(location in memory) is passed. The formal parameter is a mapping of
 * the reference to the actual parameter.
 * 
 */