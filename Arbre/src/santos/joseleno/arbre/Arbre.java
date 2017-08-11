package santos.joseleno.arbre;

public class Arbre {
	Node racine;
	int cont = 0;

	public Arbre() {
		racine = null;
	}

	public void insertNode(int valor) {
		if (racine == null) {
			racine = new Node(valor);
		} else {
			racine.insert(valor);
		}
	}

	public void postOrder() {
		postOrdeAux(racine);
	}

	public void postOrdeAux(Node no) {
		if (no == null)
			return;
		postOrdeAux(no.left);
		postOrdeAux(no.right);
		System.out.println(no.data + "");
	}

	public void preOrder() {
		preOrderAux(racine);
	}

	public void preOrderAux(Node no) {
		if (no == null)
			return;
		System.out.println(no.data + "");
		preOrderAux(no.left);
		preOrderAux(no.right);
	}

	public void orderSymmetrical() {
		orderSymmetricalAux(racine);
	}

	public void orderSymmetricalAux(Node no) {
		if (no == null)
			return;
		orderSymmetricalAux(no.left);
		System.out.println(no.data + "");
		orderSymmetricalAux(no.right);
	}

	public void search(int x) {
		searchAux(racine, x);
	}

	public void searchAux(Node node, int x) {
		if (node == null) {
			System.out.println(" Nivel -1 ");
		} else if (node.data == x) {
			System.out.println(" Nivel " + cont);
		} else if (node.data > x) {
			if (node != null) {
				cont++;
				searchAux(node.left, x);
			}
		} else if (node.data < x) {
			if (node != null) {
				cont++;
				searchAux(node.right, x);
			}
		}
	}

	public void returns(int x) {
		questAux(racine, x);
	}

	public void questAux(Node node, int x) {
		if (node.data == x) {
			System.out.println(node.data);
		} else if (node.right.data == x) {
			System.out.println(node.data);
		} else if (node.left.data == x) {
			System.out.println(node.data);
		} else if (node.data > x) {
			questAux(node.left, x);
		} else {
			questAux(node.right, x);
		}
	}

	public int SumNode(Node node) {
		int soma;

		if (node != null) {
			soma = SumNode(node.right) + SumNode(node.left) + node.data;
			return soma;
		} else
			return 0;
	}

}
