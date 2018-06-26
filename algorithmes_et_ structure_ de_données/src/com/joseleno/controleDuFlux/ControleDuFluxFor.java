package com.joseleno.controleDuFlux;

/**
 * @author joseleno on 25/06/18
 */
public class ControleDuFluxFor {
    public static void main(String[] args) {
        double valeur = 50000;
        for (int p = 1; p <= valeur; p++) {
            double valeurParcelle = valeur / p;
            if (valeurParcelle < 850) {
                break;
            }
            System.out.println("Le parcelle: " + p + " CAD$ " + valeurParcelle);
        }
    }
}

