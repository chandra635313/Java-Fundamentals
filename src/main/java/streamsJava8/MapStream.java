package streamsJava8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStream {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "John");
		map.put(1, "Adam");
		map.put(2, "Mary");

		// Print key and Value
		System.out.println("Iterate over Map: ");
		map.entrySet().stream().forEach(e -> System.out.println("Key: " + e.getKey() + " Value: " + e.getValue()));

		// Map to List
		System.out.println("\nMap to List: ");
		map.entrySet().stream().map(e -> e.getKey()).collect(Collectors.toList())
				.forEach(e -> System.out.print(e + " "));

	}

}
/*
Output:

Iterate over Map: 
Key: 1 Value: Adam
Key: 2 Value: Mary
Key: 3 Value: John

Map to List: 
1 2 3   
*/
