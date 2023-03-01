package br.com.hotel.model;

import br.com.hotel.interfaces.ICamareira;
import br.com.hotel.interfaces.IRecepcionista;

public class Gerente extends Pessoa implements ICamareira, IRecepcionista {

	public Gerente(String nome, String telefone, String cpf) {
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
		System.out.println("sei falar ingles muito bem");
		System.out.println();
		
	}

	@Override
	public void arrumarCama() {
		System.out.println("sei arrumar cama mais ou menos");
		System.out.println();
		
	}

	@Override
	public void limparQuarto() {
		System.out.println("sei limpar quarto sim");
		System.out.println();
		
	}
}
