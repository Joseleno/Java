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

		Vecteur v = new Vecteur(3);

		v.addElement("B");
		v.addElement("D");
		v.addElement("G");
		
		v.addElement(0, "A");
		v.addElement(2, "C");
		v.addElement(4, "E");
		v.addElement(5, "F");
		
		System.out.println(v.getDimension());
		System.out.println(v.toString());
		System.out.println(v.busca(0));
		System.out.println(v.busca("Element 4"));
		
		

	}

}
