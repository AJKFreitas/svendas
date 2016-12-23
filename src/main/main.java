package main;

import modelo.Endereco;

public class main {

	public static void main(String[] args) {
		Endereco e = new Endereco();
	String desc =	e.getDescricaoLogradouro("FLT");
	
	System.out.println(desc);
	
	}
}
