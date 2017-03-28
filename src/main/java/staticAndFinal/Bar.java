package staticAndFinal;

/*
  Can we Override static methods in java? 
  1. We can declare static methods with same signature in subclass, but it is not considered overriding as there
     won’t be any run-time polymorphism. 
  2. Hence the answer is ‘No’. 
  3. If a derived class defines a static method with same signature as a static method in base class, 
     the method in the derived class hides the method in the base class.
 */

public class Bar extends Foo {

	public static void test() {
		System.out.println("Inside Bar static method");
	}

	public void print() {
		System.out.println("Inside Bar print method");
	}

	public static void main(String s[]) {
		Foo foo = new Foo();
		Foo fooBar = new Bar();
		Bar bar = new Bar();

		foo.test();

		fooBar.test();
		fooBar.print();

		bar.test();

	}
}
