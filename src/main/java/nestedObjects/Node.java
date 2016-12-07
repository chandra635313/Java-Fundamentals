package nestedObjects;

public class Node {
	int data;
	Node left = new Node();
	Node right = new Node();

	public void show(String s) {
		System.out.println(s);
	}
}
