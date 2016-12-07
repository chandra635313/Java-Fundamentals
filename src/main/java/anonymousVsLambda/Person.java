package anonymousVsLambda;

public interface Person {
	String citizenLevel(int age);

	default void test(int i) {
		i = i + 1;
		System.out.println("Defaut Method: " + i);
	}
}
