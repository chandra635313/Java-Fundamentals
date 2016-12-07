package extras;

public class FizzBuzz {

	public static String fizzbuzz(Integer num) {
		if (num % 3 == 0 && num % 5 == 0) {
			return "fizzBuzz";
		}
		if (num % 3 == 0) {
			return "fizz";
		} else if (num % 5 == 0) {
			return "buzz";
		}

		return num.toString();

	}

	public static void main(String[] args) {
		System.out.println(fizzbuzz(3));
	}

}
