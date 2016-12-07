package genericExample;

import java.util.Collection;

public class GenericExample<T> {

	public <T> int count(Collection<T> collection) {
		int count = 0;
		for (T s : collection) {
			count = count + 1;
		}

		return count;
	}
}
