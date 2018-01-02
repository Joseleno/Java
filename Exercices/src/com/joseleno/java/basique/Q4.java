package com.joseleno.java.basique;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String vogais = "aeiou";
		System.out.println("Digite uma letra: ");
		char a = s.next().toLowerCase().charAt(0);
		int v = 0;
		for (int i = 0; i < vogais.length(); i++) {
			if (vogais.charAt(i) == a) {
				v++;
			}
		}
		if (v > 0) {
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		}
		
		s.close();

	}
	



}
