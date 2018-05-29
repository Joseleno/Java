package com.joseleno.numero;

import java.util.Scanner;

public class NombrePremier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int cont = 0;
		Scanner tec = new Scanner(System.in);
		System.out.println("-----");
		do {
			System.out.print("S'il vous plait, entrez un nombre valide: ");
			n = tec.nextInt();
		} while (n <= 0);
		for (int i = 1; i <= n; i++) {
			if (n%i==0) {
				cont++;
			}
		}
		if (cont == 2) {
			System.out.println("* " + String.valueOf(n) + " est un Nombre Premier");
		}else {
			System.out.println("* " + String.valueOf(n) + " n'est pas un Nombre Premier");
		}
		
	}
}
