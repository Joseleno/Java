package impot;

import java.util.Scanner;

import impot.service.Impot;
import impot.service.TypeImpot;

public class Program {
	
	public static void main(String[] args) {
		try (Scanner entree = new Scanner(System.in)){
			System.out.print("Entrez la valeur: ");
			double valeur = entree.nextDouble();
			System.out.print("Entrez le type de taxe 1 ou 2: ");
			int taxe = entree.nextInt();
			TypeImpot typeImpot = TypeImpot.values()[taxe-1];
			
			Impot impot = typeImpot.obtenirImpot();
			
			double valeurImpot = impot.calculerImpot(valeur);
			
			System.out.print("La valeur d'Impôt est: "+ valeurImpot );
			
		}
	}
}
