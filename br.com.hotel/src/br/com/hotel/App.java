package br.com.hotel;

import java.util.ArrayList;
import java.util.Comparator;

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
		
//		Recepcionista recepcionista1 = new Recepcionista("Valéria", "2176753444", "72524552555");
//	
//		recepcionista1.atendertelefone();
//		recepcionista1.falarIngles();
//		
//		Camareira camareira1 = new Camareira("Joana", "2176783444", "72524992555");
//		
//		camareira1.arrumarCama();
//		camareira1.limparQuarto();
//		
//		Gerente gerente1 = new Gerente("joao", "82383637863", "63783378");
//		
//		gerente1.atendertelefone();
//		gerente1.falarIngles();
//		gerente1.arrumarCama();
//		gerente1.limparQuarto();
//		
//		Quarto quarto1 = new Quarto();
//		quarto1.setNumero("323b");
//		quarto1.setValor(100.0);
//		quarto1.setTipo(EnumTipo.BASICO);
//		
//		Quarto quarto2 = new Quarto();
//		quarto2.setNumero("353b");
//		quarto2.setValor(200.0);
//		quarto2.setTipo(EnumTipo.PRESIDENCIAL);
		
		Cliente cliente1 = new Cliente("Manoel da Silva", "219999988888", "54315345624", 42);
		Cliente cliente2 = new Cliente("Fulano de Tal", "219999988888", "54315345624", 21);
		Cliente cliente3 = new Cliente("Ciclano da Silva", "219999988888", "54315345624", 36);
		Cliente cliente4 = new Cliente("Beltrano da Silva", "219999988888", "54315345624", 56);
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		
		clientes.stream().count();
		clientes.size();
		
		//mostra até o limite
		clientes.stream().limit(2).forEach(c -> System.out.println(c.getNome()));
		// pula o numnero incluso no skip e mostra os seguintes 
		System.out.println("===================================");
		clientes.stream().skip(2).forEach(c -> System.out.println(c.getNome())); 
	
		//var resultado3 = clientes.stream().sorted();
		
		//clientes.stream().sorted(comparing(Cliente::getIdade));
		System.out.println("===================================");
		clientes.stream().filter(c -> c.getIdade() > 25).forEach(c -> System.out.println(c.getNome()));
	
		System.out.println("===================================");
		clientes.stream().filter(c -> c.getNome().contains("Silva")).forEach(c -> System.out.println(c.getNome()));
	
		System.out.println("===================================");
		clientes.stream().filter(c -> c.getNome().startsWith("B")).forEach(c -> System.out.println(c.getNome()));
	
		clientes.stream().map(c -> c.getNome());
		
		clientes.stream().map(Cliente::getNome);
	} 


}
