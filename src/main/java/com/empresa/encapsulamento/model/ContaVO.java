package com.empresa.encapsulamento.model;

public class ContaVO {

	private PessoaVO titular;
    private int agencia;
    private int numero;
    private double saldoBancario;
    
	public PessoaVO getTitular() {
		return titular;
	}
	
	public void setTitular(PessoaVO titular) {
		this.titular = titular;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public double getSaldoBancario() {
		return saldoBancario;
	}
	
	public void setSaldoBancario(double saldoBancario) {
		this.saldoBancario = saldoBancario;
	}

	@Override
	public String toString() {
		return "ContaVO [titular=" + titular + ", agencia=" + agencia + ", numero=" + numero + ", saldoBancario="
				+ saldoBancario + "]";
	}
	
	
}
  
