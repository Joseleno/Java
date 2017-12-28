package com.joseleno.java.basique;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Numero 1: ");
		a = scan.nextInt();
		System.out.println("Numero 2: ");
		b = scan.nextInt();
		scan.close();
		if (a > b) {
			System.out.println("Le plus grand nombre est: "+ a);	
		}else {
			if (a < b) {
			System.out.println("Le plus grand nombre est: "+ b);	
		}else
			System.out.println("Les mêmes numéros");	
		}
	}
}