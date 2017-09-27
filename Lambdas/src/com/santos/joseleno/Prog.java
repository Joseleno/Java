package com.santos.joseleno;

public class Prog {

	public static void main(String[] args) {
		System.out.println("===Inicio===");
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("teste lambida");
				
			}
		};
		
		Runnable r2 = () -> System.out.println("Teste lambida2");
		
		r1.run();
		r2.run();

	}

}
