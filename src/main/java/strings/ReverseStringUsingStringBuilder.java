package strings;

//Same program can be used to find if the given String is palindrome or not.
public class ReverseStringUsingStringBuilder {
	public static void main(String[] args) {
		String input = "Hello there";
		
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1 = input1.reverse();
		
		System.out.println(input1);
		
		for (int i = 0; i < input1.length(); i++)
			System.out.print(input1.charAt(i));
	}
}
