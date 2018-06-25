import prototype.Vetement;
import prototype.VetmentCache;

public class Program {
	public static void main(String[] args) {
		VetmentCache.ChargeCache();
		
		Vetement vet1 = VetmentCache.getModelVetment("Pantalons");
		System.out.println("Vetment: " + vet1.getModel() + "- Taille: " + vet1.getTaille());
		
		Vetement vet2 = VetmentCache.getModelVetment("Jupe");
		System.out.println("Vetment: " + vet2.getModel() + "- Taille: " + vet2.getTaille());
	}
}
