package streamsJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
