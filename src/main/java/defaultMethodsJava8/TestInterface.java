package defaultMethodsJava8;

public interface TestInterface {
	public void square(int a);

	// default method
	default void show() {
		System.out.println("Default Method Executed");
	}
	
	static void print(){
		System.out.println("Interface Static Method Executed");
	}
}
