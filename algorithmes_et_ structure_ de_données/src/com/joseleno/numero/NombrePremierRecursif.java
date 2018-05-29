package com.joseleno.numero;

import java.util.Scanner;

public class NombrePremierRecursif {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("S'il vous plait, entrez un nombre valide: ");
		int n = sc.nextInt();
		System.out.printf("%n => %d ", n);
		System.out.print(nombrePremier(n, 2) ? " est un Nombre Premier." : " n'est pas un Nombre Premier.");
	}

	private static boolean nombrePremier(int num, int divisor) {
		if (num / 2 < divisor) {
			return true;
		} else {
			if (num % divisor == 0) {
				return false;
			} else {
				return nombrePremier(num , divisor + 1 );
			}
		}
	}
}
