package com.joseleno.controleDuFlux;

public class ControleDuFluxIf3 {

    public static void main(String[] args) {
        int satire = 5500;
        String imposto;

        if (satire < 1000) {
            imposto = "5%";
        } else if (satire <= 1000 && satire < 2000) {
            imposto = "10%";
        } else if (satire >= 2000 && satire < 4000) {
            imposto = "15%";
        } else {
            imposto = "20%";
        }
        System.out.println("Imposto = " + imposto);
    }
}