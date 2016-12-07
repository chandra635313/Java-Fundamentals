package overrrideHashcodeAndEquals;

public class Main {

	public static void main(String s[]) {

		// Using Classic way
		UserClassicWay user1 = new UserClassicWay("john", 25, "111222333");
		UserClassicWay user2 = new UserClassicWay("john", 25, "111222333");
		System.out.println("Using Classic way: " + user1.equals(user2));

		// Using new Objects class
		UserNewWay user3 = new UserNewWay("john", 25, "111222333");
		UserNewWay user4 = new UserNewWay("john", 25, "111222333");
		System.out.println("Using new Objects class: " + user3.equals(user4));
	}
}
