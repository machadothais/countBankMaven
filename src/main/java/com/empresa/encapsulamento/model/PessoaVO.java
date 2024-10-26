package com.empresa.encapsulamento.model;

public class PessoaVO {

	private String nome;
    private String documento;
    
	public PessoaVO() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "PessoaVO [nome=" + nome + ", documento=" + documento + "]";
	}
	
}
