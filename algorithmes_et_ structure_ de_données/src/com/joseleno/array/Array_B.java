package com.joseleno.array;

/**
 * @author joseleno on 26/06/18
 */
public class Array_B {
    public static void main(String[] args) {
        int taille = 3;
        //Numbers - double, float, long, int, short, byte
        int[] numberExemple = new int[taille];
        //boolean
        boolean[] booleanExemple = new boolean[taille];
        //Objects
        String[] stringExemple = new String[taille];
        
        for (int i = 0; i< taille; i++){
            System.out.println("Numeros: " + numberExemple[i]);
            System.out.println("Boolean: " + booleanExemple[i]);
            System.out.println("Objects: " + stringExemple[i]);
        }
    }
}
