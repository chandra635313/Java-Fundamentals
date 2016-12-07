package java8foreachExamples;

import java.util.ArrayList;
import java.util.List;

public class ListAndforeach {

	public static void main(String s[]) {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		for (String item : items) {
			System.out.println(item);
		}
	}
}
