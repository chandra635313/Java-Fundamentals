package defaultMethodsJava8;

public class DefaultMethodExample implements TestInterface {

	@Override
	public void square(int a) {
		System.out.println(a * a);
	}
	
	public static void main(String s[]){
		TestInterface test = new DefaultMethodExample();
		test.square(2);
		test.show(); //Calling default method
		
		TestInterface.print();
	}

}
