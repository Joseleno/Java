package santos.joseleno.arbre;

public class Node {

	Node left;
	Node right;

	int data;

	public Node(int dado) {
		left = right = null;
		this.data = dado;
	}

	public void insert(int value) {
		if (value < data)

		{
			if (left == null) {
				left = new Node(value);
			} else {
				left.insert(value);
			}
		} else if (value > data) {
			if (right == null) {
				right = new Node(value);
			} else {
				right.insert(value);
			}
		}
	}

}