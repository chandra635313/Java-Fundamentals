package lambdaExpressionExamples;

import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class Main {

	public static void main(String[] args) {

		/**
		 * Creating functional interface objects and then passing those objects
		 * to the method as an argument
		 */
		TestLambdaExpression testLambdaExpression = new TestLambdaExpression();

		/**
		 * Creating green (operation ready object) functional interface object
		 * using lambda expression. Now you can separately define functional
		 * interface object or directly pass it as the argument. Remember the
		 * lambda expr imagination.
		 */
		Check c = (a, b) -> a + b;
		int d = testLambdaExpression.add(2, 5, c);
		System.out.println("Printing value--------->  " + d);
		
		//simple example
		System.out.println(c.test(4, 6));

		/**
		 * Using Predicate instead of custom functional interface argument ->
		 * body (Lambda expression). Return true if age > 0
		 */
		Predicate<Person> pd = p -> p.getAge() > 0;
		Person pr = new Person();
		pr.setAge(25);
		pr.setId(1);
		testLambdaExpression.test2(pr, pd);

		/******* Another predicate *******/
		ToIntFunction<String> func = s -> Integer.parseInt(s);
		int i = testLambdaExpression.convertToInt("12345", func);
		System.out.println(i);

	}
}
