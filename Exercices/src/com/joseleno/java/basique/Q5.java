package com.joseleno.java.basique;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		double n1;
		double n2;
		System.out.println("Digite a Nota 1: ");
		n1 = n.nextDouble();
		System.out.println("Digite a Nota 2: ");
		n2 = n.nextDouble();
		double m = (n1 + n2) / 2;
		if (m < 7) {
			System.out.println("Reprovado");
		} else {
			if (m == 10) {
				System.out.println("Aprovado com Distinção");
			} else {
				System.out.println("Aprovado");
			}
		}
		n.close();

	}

}
