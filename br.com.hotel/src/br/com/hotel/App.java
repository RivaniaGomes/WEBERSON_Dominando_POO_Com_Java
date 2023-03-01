package br.com.hotel;

import br.com.hotel.model.Camareira;
import br.com.hotel.model.Cliente;
import br.com.hotel.model.EnumTipo;
import br.com.hotel.model.Gerente;
import br.com.hotel.model.Quarto;
import br.com.hotel.model.Recepcionista;

public class App {

	public static void main(String[] args) {
		System.out.println("Hotel Java");
		System.out.println();

		Cliente cliente1 = new Cliente("Manoel da Silva", "219999988888", "54315345624");
		
		Recepcionista recepcionista1 = new Recepcionista("Valéria", "2176753444", "72524552555");
	
		recepcionista1.atendertelefone();
		recepcionista1.falarIngles();
		
		Camareira camareira1 = new Camareira("Joana", "2176783444", "72524992555");
		
		camareira1.arrumarCama();
		camareira1.limparQuarto();
		
		Gerente gerente1 = new Gerente("joao", "82383637863", "63783378");
		
		gerente1.atendertelefone();
		gerente1.falarIngles();
		gerente1.arrumarCama();
		gerente1.limparQuarto();
		
		Quarto quarto1 = new Quarto();
		quarto1.setNumero("323b");
		quarto1.setValor(100.0);
		quarto1.setTipo(EnumTipo.BASICO);
		
		Quarto quarto2 = new Quarto();
		quarto2.setNumero("353b");
		quarto2.setValor(200.0);
		quarto2.setTipo(EnumTipo.PRESIDENCIAL);
	}

}
