package com.empresa.encapsulamento.main;

import com.empresa.encapsulamento.model.PessoaVO;

public class Principal {

	public static void main(String[] args) {
		PessoaVO Titular1 = new PessoaVO();
		Titular1.setNome("Thais Machado");
		Titular1.setDocumento("97346");
		System.out.println("Titular1: " + Titular1.getNome());
		System.out.println("Titular1: " + Titular1.getDocumento());
		
		PessoaVO Titular2 = new PessoaVO();
        Titular2.setNome("Maria Abadia");
        Titular2.setDocumento("22233344455");
        System.out.println("Titular2: " + Titular2.getNome());
		System.out.println("Titular2: " + Titular2.getDocumento());
        

	}

}
