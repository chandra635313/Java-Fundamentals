package reverseNumber;

public class ReverseNumber {

	public static int reverse(int x) {
		long y = x % 10;
		while ((x /= 10) != 0)
			y = y * 10 + x % 10;
		return (Math.abs(y) > Integer.MAX_VALUE) ? 0 : (int) y;
	}

	public static int reverseNum(int number) {
		int reversedNumber = 0;
		int temp = 0;

		while (number > 0) {
			temp = number % 10;
			reversedNumber = reversedNumber * 10 + temp;
			number = number / 10;
		}
		return reversedNumber;
	}

	public static int reverseNumber(int x) {
		long n = 0;
		while (x != 0) {
			n = n * 10 + x % 10;
			x = x / 10;
		}

		return Math.abs(n) > Integer.MAX_VALUE ? 0 : (int) n;

	}

	public static void main(String[] args) {

		int number = -1234;

		System.out.println("Reversed Number is: " + reverseNum(number));
		System.out.println("Reversed Number is: " + reverse(number));
		System.out.println("Reversed Number is: " + reverseNumber(number));

	}
}
