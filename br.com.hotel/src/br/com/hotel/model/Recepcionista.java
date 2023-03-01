package br.com.hotel.model;

import br.com.hotel.interfaces.IRecepcionista;

public class Recepcionista extends Pessoa implements IRecepcionista{

	public Recepcionista(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atendertelefone() {
		System.out.println("sei atender telefone sim");
		System.out.println();
		
	}

	@Override
	public void falarIngles() {
		System.out.println("sei falar ingles sim");
		System.out.println();
		
	}

}
