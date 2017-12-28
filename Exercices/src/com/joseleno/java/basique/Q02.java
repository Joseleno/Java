package com.joseleno.java.basique;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Premier numero: ");
		int a = scan.nextInt();
		
		
		if (a<0) {
			System.out.print("Negative");
		}else {
			System.out.print("Positive");
		}

	}

}
