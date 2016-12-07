package genericExample;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String s[]) {
		GenericExample<String> genericExample = new GenericExample<String>();
		List<String> listString = new ArrayList<String>();
		listString.add("Hello");
		listString.add("there");

		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(2);
		listInt.add(4);
		listInt.add(6);

		System.out.println("listString Count is:-------> " + genericExample.count(listString));
		System.out.println("listString Count is:-------> " + genericExample.count(listInt));
	}
}
