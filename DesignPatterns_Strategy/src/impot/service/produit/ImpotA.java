package impot.service.produit;

import impot.service.Impot;

public class ImpotA implements Impot{

	@Override
	public double calculerImpot(double valeur) {
		
		return valeur * 1.25;
	}

}
