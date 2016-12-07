package nestedInterface;

public class TestNestedInterface implements Showable.Message {

	@Override
	public void msg() {
		System.out.println("Hello nested interface");
	}

}
