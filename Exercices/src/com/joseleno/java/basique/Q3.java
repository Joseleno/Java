package com.joseleno.java.basique;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite F ou M");
		String lettre = scan.next().toUpperCase();
		
		if(lettre.equals("M")) {
			System.out.println("Masculino");	
		}else {
			if(lettre.equals("F")) {
				System.out.println("Feminino");	
			}else {
				
					System.out.println("Não declarado");	
				
			}
		}
	}

}
