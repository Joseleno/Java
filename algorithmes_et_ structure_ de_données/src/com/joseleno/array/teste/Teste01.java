/**
 * 
 */
package com.joseleno.array.teste;

import com.joseleno.array.Vecteur;

/**
 * @author Joseleno
 *
 */
public class Teste01 {

	public static void main(String[] args) {

		Vecteur v = new Vecteur(5);

		v.addElement("Element 1");
		v.addElement("Element 2");
		v.addElement("Element 3");
		
		System.out.println(v.getDimension());
		System.out.println(v.toString());

	}

}
