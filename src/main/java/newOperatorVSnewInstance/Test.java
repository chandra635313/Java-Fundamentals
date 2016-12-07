package newOperatorVSnewInstance;

public class Test {

	public static void fun(String className)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		Object obj = Class.forName(className).newInstance();

		System.out.println("Object created for class:" + obj.getClass().getName());
	}

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		fun("A");
	}
}
