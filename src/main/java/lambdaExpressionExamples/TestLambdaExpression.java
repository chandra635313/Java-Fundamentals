package lambdaExpressionExamples;

import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class TestLambdaExpression {

	public int add(int a, int b, Check c) {
		return c.test(a, b);
	}

	public void test2(Person p, Predicate<Person> pd) {
		if (pd.test(p)) {
			p.print();
		}
	}

	public int convertToInt(String str, ToIntFunction<String> func) {
		return func.applyAsInt(str);
	}

}
