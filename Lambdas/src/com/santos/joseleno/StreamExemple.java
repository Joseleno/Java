package com.santos.joseleno;

import java.util.Arrays;
import java.util.List;

public class StreamExemple {

	public static void main(String[] args) {
		// avant Java 8
		System.out.println("  avant Java 8");
		List<String> list1 = Arrays.
				asList("Br�sil", "France", "Canada", "Chine", "Russie");

		for (String s : list1) {
			System.out.println(s);
		}

		// Java 8 Lambda
		System.out.println(" Lambda");
		list1.forEach(x -> System.out.println(x));

		System.out.println("R�f�rences de M�thodes");
		// Java 8 les r�f�rences de m�thodes
		list1.forEach(System.out::println);
	}
}
