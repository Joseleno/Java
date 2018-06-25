package prototype;

public class Jupe extends Vetement{
	
	public Jupe() {
		model = this.getClass().getName();
	}

	@Override
	public void nouveauTypeVetment() {
		System.out.println("Ce vetement est: " + this.model + " Taille: " + this.taille );
		
	}
}
