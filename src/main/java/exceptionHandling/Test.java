package exceptionHandling;

public class Test {

	//Exception needs to be handled when instantiating as constructor of the class is throwing one.
	public Test(String s) throws MyException {
		System.out.println(s);
	}

	public void custom(String s) throws MyException {
			throw new MyException(s);
	}

	public static void main(String s[]) {
		try {
			Test test = new Test("Testing"); // Exception handled here
			test.custom("Exception caught");
		} catch (MyException e) {
			e.printStackTrace();
		}

	}

}
