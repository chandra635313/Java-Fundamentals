package anonymousVsLambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] s) {

		List<String> names = new ArrayList<>();
		names.add("john");
		names.add("cali");

		/*************** Using Anonymous class *****************/
		Person p = new Person() {
			@Override
			public String citizenLevel(int age) {
				if (age < 30) {
					return "You are Junior";
				}
				return "You are Senior";
			}
		};

		/*************** Using Lambda Expression *****************/
		Person p1 = (a) -> {
			if (a < 30) {
				return "You are Junior";
			}
			return "You are Senior";
		};

		/*************** Using Streams *****************/
		String str = names.stream().filter(x -> x.equals("john")).findAny().orElse(null);
		System.out.println("Stream Example:----------->" + str);

		
		
		AnonymousClassExample a = new AnonymousClassExample();
		System.out.println("Using Anonymous Class:-------------> " + a.testing(35, p));
		System.out.println("Using Lambda Expression:----------->" + a.testing(20, p1));

		// Default Method Example
		p1.test(1);

	}
}
