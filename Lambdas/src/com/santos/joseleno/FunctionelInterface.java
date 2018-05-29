package com.santos.joseleno;

public class FunctionelInterface implements InterC{

	interface Num {
		double getValue();
	}
	
	interface ValorNumerico{
		boolean teste(int a);
	}
	
	interface NumeroValor{
		boolean testeValor(int a, int b);
	}
	
public FunctionelInterface() {
	
}
	public static void main(String[] args) {
		Num n;
		n = () -> 1.5;
		System.out.println(n.getValue());
		
		Num n2 = () -> Math.random()*100;
		System.out.println(n2.getValue());
		System.out.println(n2.getValue());
		
		
		ValorNumerico isPar = (int a) -> (a % 2) == 0;
		System.out.println(isPar.teste(56));
		System.out.println(isPar.teste(57));
		
		
		NumeroValor isDiv = (x,y) -> (x%y)==0;
		System.out.println(isDiv.testeValor(12,2));
		System.out.println(isDiv.testeValor(0,12));
		FunctionelInterface f = new FunctionelInterface();
		
		System.out.println(f.nome);
		
	}

	@Override
	public String nome(String a, String b) {
		// TODO Auto-generated method stub
		return this.nome;
	}
	

	

}
