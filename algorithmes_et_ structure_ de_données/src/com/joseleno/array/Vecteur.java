package com.joseleno.array;

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
		this.aumentaTamanho();		
		if(this.dimension < this.elements.length) {
			this.elements[this.dimension] = element;
			this.dimension++;
			return true;
		}
		return false;
	}
	
	public String busca(int posicao) {
		
		if(!(posicao>=0 && posicao<dimension)){
			throw new IllegalArgumentException("Posição Invalida");
		}
		
		return this.elements[posicao];
	}
	
	
	public int busca(String elemento) {
		for( int i=0; i<this.dimension; i++) {
			if (this.elements[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean addElement(int posicao, String element) {
		this.busca(posicao);
		this.aumentaTamanho();
		for (int i = this.dimension-1; i >= posicao; i--) {
			this.elements[i+1] = this.elements[i];
		}
		this.elements[posicao] = element;
		this.dimension++;
		
		return true;
	}
	
	private void aumentaTamanho() {
		if(this.dimension==this.elements.length) {
			String[] novoElements = new String[this.elements.length * 2];
			for (int i = 0; i < this.elements.length; i++) {
				novoElements[i] = this.elements[i];
			}
			this.elements = novoElements;
		}
	}
}
