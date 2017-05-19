package streamsJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
1. For List, Set, Map:
   Example 1: list.forEach(System.out::println)
   Example 2: set.stream().filter(e -> e%2 == 0).forEach(System.out::print);

2. For every element in arrays: Use Arrays.stream()
   Arrays.stream(array).forEach(System.out::println)
*/
public class Demo {

	public static void main(String s[]) {

		List<Integer> numbers = Arrays.asList(2, 4, 6, 8);

		numbers = numbers.stream().map(x -> x * x).collect(Collectors.toList());

		System.out.println(numbers);

		numbers.forEach(e -> {
			if (e == 4) {
				System.out.println("Found 4");
			}
		});
	}

}
