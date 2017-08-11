package santos.joseleno.arbre;

public class Prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node no = new Node(20);
		Arbre arvore = new Arbre();
		arvore.racine = no;
		arvore.insertNode(50);
		for (int i = 1; i <50; i++) {
			arvore.insertNode(i);
		}
		
		System.out.println(arvore.toString());
		System.out.println("------------------------------");
		arvore.postOrder();
		System.out.println(arvore.toString());
		System.out.println("------------------------------");
		arvore.preOrder();
		System.out.println(arvore.toString());
		
		
	}
}
