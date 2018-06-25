package prototype;

public class Pantalons extends Vetement{
	
	public Pantalons() {
		model = this.getClass().getName();
		taille = "16";
	}

	@Override
	public void nouveauTypeVetment() {
		System.out.println("Ce vetement est: " + this.model + " Taille: " + this.taille );
		
	}
}
