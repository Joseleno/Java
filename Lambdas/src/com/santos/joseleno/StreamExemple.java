package com.santos.joseleno;

import java.util.Arrays;
import java.util.List;

public class StreamExemple {

	public static void main(String[] args) {
		// antes do Java 8
		List<String> list1 = Arrays.asList("Santa Catarina", "Parana", "São Paulo", "Rio de Janeiro", "Brasilisa",
				"Ceará");

		for (String s : list1) {
			System.out.println(s);
		}
		
		
		//Java 8 Lambda
		list1.forEach(x -> System.out.println(x));
		
		//Java 8 Method REference
		list1.forEach(System.out::println);
	}
}
