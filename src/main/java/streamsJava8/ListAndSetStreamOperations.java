package streamsJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
1. For List, Set, Map:
   Example 1: list.forEach(System.out::println)
   Example 2: set.stream().filter(e -> e%2 == 0).forEach(System.out::print);

2. For every element in arrays: Use Arrays.stream()
   Arrays.stream(array).forEach(System.out::println)
*/

public class ListAndSetStreamOperations {

	public static void main(String s[]) {

		List<Integer> numbers = Arrays.asList(5, 2, 8, 4, 1);
		List<Character> letters = Arrays.asList('c', 'b', 'a');
		List<String> words = Arrays.asList("gmailc", "gmailb", "gmaila");
		List<Student> students = Arrays.asList(new Student(2, "john"), new Student(1, "adam"));

		// forEach method
		System.out.println("forEach method: ");
		numbers.forEach(e -> System.out.print(e + " "));

		// Sort integer list
		System.out.println("\n\nSorted integer List: ");
		numbers.stream().sorted().forEach(e -> System.out.print(e + " "));

		// Reverse Sorted integer list
		System.out.println("\n\nReverse Sorted integer List: ");
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));

		// Sort character list
		System.out.println("\n\nSorted character List: ");
		letters.stream().sorted().forEach(c -> System.out.print(c + " "));

		// Sort String list
		System.out.println("\n\nSorted String List: ");
		words.stream().sorted().forEach(w -> System.out.print(w + " "));

		// Sort Object list
		System.out.println("\n\nSorted Object List: ");
		students.stream().sorted(Comparator.comparing(Student::getId))
				.forEach(st -> System.out.print(st.getId() + " " + st.getName() + " "));

		// Using map and collect method
		System.out.println("\n\nUsing map and collect: ");
		numbers = numbers.stream().map(x -> x * x).collect(Collectors.toList());
		numbers.forEach(e -> System.out.print(e + " "));

		// Using filter
		System.out.println("\n\nUsing filter: ");
		numbers.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.print(e + " "));

	}

}

/*
Output:

forEach method: 
5 2 8 4 1 

Sorted integer List: 
1 2 4 5 8 

Reverse Sorted integer List: 
8 5 4 2 1 

Sorted character List: 
a b c 

Sorted String List: 
gmaila gmailb gmailc 

Sorted Object List: 
1 adam 2 john 

Using map and collect: 
25 4 64 16 1 

Using filter: 
4 64 16 
 
*/
