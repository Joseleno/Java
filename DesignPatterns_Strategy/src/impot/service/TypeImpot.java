package impot.service;

import impot.service.produit.ImpotA;
import impot.service.produit.ImpotB;

public enum TypeImpot {
	ImpotA {
		@Override
		public Impot obtenirImpot() {
			// TODO Auto-generated method stub
			return new ImpotA();
		}
	},
	ImpotB {
		@Override
		public Impot obtenirImpot() {
			// TODO Auto-generated method stub
			return new ImpotB();
		}
	};
	
	public abstract Impot obtenirImpot();
}
