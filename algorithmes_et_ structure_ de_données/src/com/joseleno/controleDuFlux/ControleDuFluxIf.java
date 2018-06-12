package com.joseleno.controleDuFlux;

/**
 * @author joseleno
 * Date: 12/06/18 15:46
 */
public class ControleDuFluxIf {

    //psvm
    public static void main(String[] args) {
        int age = 18;
        String categorie;

        if(age < 15){
            categorie = "Infantil";
        }else if (age >= 15 && age <18){
            categorie = "Jeune";
        }else{
            categorie = "Adulte";
        }

        System.out.println(categorie);
    }
}
