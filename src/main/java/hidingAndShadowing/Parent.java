package hidingAndShadowing;

/*
 Hiding : Happens during inheritance (between superclass and subclass). "city" in Child hides the one in Parent.
 Shadowing : Happens within a class (between a global variable and local variable).
 */

public class Parent {
	String city = "San Francisco";
}

class Child extends Parent {

	String city = "San Francisco";

	void print() {

		String city = "San Francisco";

	}

}