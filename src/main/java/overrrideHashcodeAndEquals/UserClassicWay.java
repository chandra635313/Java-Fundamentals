/********************** Classic Way to override hashcode() and equals()*************************/

package overrrideHashcodeAndEquals;

public class UserClassicWay {
	private String name;
	private int age;
	private String passport;

	public UserClassicWay(String name, int age, String passport) {
		this.name = name;
		this.age = age;
		this.passport = passport;
	}

	@Override
	public boolean equals(Object o) {

		if (o == this)
			return true;
		if (!(o instanceof UserClassicWay)) {
			return false;
		}

		UserClassicWay user = (UserClassicWay) o;

		return user.name.equals(name) && user.age == age && user.passport.equals(passport);
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + name.hashCode();
		result = 31 * result + age;
		result = 31 * result + passport.hashCode();
		return result;
	}
}
