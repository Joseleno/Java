package prototype;

import java.util.Hashtable;

public class VetmentCache {
	public static Hashtable<String, Vetement> vetmentCache = new Hashtable<String, Vetement>();
	
	public static Vetement getModelVetment(String Model) {
		Vetement vet = vetmentCache.get(Model);
		return (Vetement) vet.clone();
	}
	
	public static void ChargeCache() {
		Pantalons pant = new Pantalons();
		Jupe jup = new Jupe();
		vetmentCache.put("Pantalons", pant);
		vetmentCache.put("Jupe", jup);
	}
}
