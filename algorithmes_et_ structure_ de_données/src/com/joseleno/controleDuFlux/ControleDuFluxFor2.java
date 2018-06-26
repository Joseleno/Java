package com.joseleno.controleDuFlux;

import java.util.Locale;

/**
 * @author joseleno on 25/06/18
 */
public class ControleDuFluxFor2 {
    public static void main(String[] args) {
        double valeur = 50000;
        String parcelle ;
        for (int p = (int) valeur; p >= 1; p--) {
            double valeurParcelle = valeur / p;
            if (valeurParcelle <= 850) {
                continue;
            }
             parcelle = String.format(Locale.CANADA_FRENCH, "%.2f", valeurParcelle);
            System.out.println("Le parcelle: " + p + " CAD$ " + parcelle);
        }
    }
}
