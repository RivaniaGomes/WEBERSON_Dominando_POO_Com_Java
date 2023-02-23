package br.com.bank;

import br.com.bank.model.ContaBancaria;

public class App {

	public static void main(String[] args) {
		System.out.println("Criando nosso Banco Digital");
		System.out.println();

		ContaBancaria conta = new ContaBancaria("0001", "7542", 5, 100.0);
		
		System.out.println("O saldo atual é de R$ " + conta.getSaldo());
		System.out.println();
		
		conta.depositar(250.0);
		System.out.println("O saldo atual é de R$ " + conta.getSaldo());
		System.out.println();
		
		conta.sacar(150.0);
		System.out.println("O saldo atual é de R$ " + conta.getSaldo());
		System.out.println();
	}

}
