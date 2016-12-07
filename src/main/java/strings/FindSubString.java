package strings;

/******************** Write a function to find a substring in a string.************************/
public class FindSubString {

	public static void main(String[] args) {
		String s1 = "This is a example string";
		String s2 = "example";

		System.out.println(findSubString(s1, s2));

	}

	public static boolean findSubString(String s1, String s2) {
		if (s1.toLowerCase().contains(s2.toLowerCase())) {
			return true;
		}
		return false;
	}

}
