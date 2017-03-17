package abstraction;

public class Driver {

	public static void main(String[] args) {
		Shape s;

		s = new Circle();
		s.draw();

		s = new Rectangle();
		s.draw();
	}

}
