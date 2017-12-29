package com.joseleno.array;

import java.util.Arrays;

public class Vecteur {
	
	
	private String[] elements;
	private int dimension;
	
	public int getDimension() {
		return dimension;
	}

	public Vecteur(int dimension) {
		this.elements = new String[dimension];
		this.dimension = 0;
	}
	
	
	
	
	@Override
	public String toString() {
		
		StringBuilder st = new StringBuilder();
		st.append("[");
		for (int i = 0; i < this.dimension-1; i++) {
			st.append(this.elements[i]);
			st.append(", ");
		}
		
		if(this.dimension>0) {
			st.append(this.elements[this.dimension-1]);
		}
		
		st.append("]");
		return st.toString();
	}

	public boolean addElement(String element){
		
		if(this.dimension < this.elements.length) {
			this.elements[this.dimension] = element;
			this.dimension++;
			return true;
		}
		return false;
	}
	
}
