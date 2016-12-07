/** For JDK 7 and above, you can use the new Objects class to generate the equals and hash code values **/

package overrrideHashcodeAndEquals;

import java.util.Objects;

public class UserNewWay {
	private String name;
	private int age;
	private String passport;

	public UserNewWay(String name, int age, String passport) {
		this.name = name;
		this.age = age;
		this.passport = passport;
	}

	@Override
	public boolean equals(Object o) {

		if (o == this)
			return true;
		if (!(o instanceof UserNewWay)) {
			return false;
		}
		UserNewWay user = (UserNewWay) o;
		return age == user.age && Objects.equals(name, user.name) && Objects.equals(passport, user.passport);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age, passport);
	}

}
