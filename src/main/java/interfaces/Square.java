package interfaces;

public class Square implements Shape {

	@Override
	public void getShape() {
		System.out.println("SQUARE");

	}

	public static void main(String s[]) {
		Shape shape = new Circle();
		shape.getShape();

		shape = new Square();
		shape.getShape();

	}

}
