package br.com.hotel.model;

import br.com.hotel.interfaces.ICamareira;

public class Camareira extends Pessoa implements ICamareira{

	public Camareira(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arrumarCama() {
		System.out.println("sei arrumar cama sim");
		System.out.println();
		
	}

	@Override
	public void limparQuarto() {
		System.out.println("sei limpar quarto sim");
		System.out.println();
		
	}

}
