package br.com.bank;

import br.com.bank.model.ContaCorrente;
import br.com.bank.model.ContaPoupanca;

public class App {

	public static void main(String[] args) {
		System.out.println("Criando nosso Banco Digital");
		System.out.println();

		ContaCorrente conta = new ContaCorrente("0001", "7542", 5, 100.0);
		
		System.out.println("O saldo atual é de R$ " + conta.getSaldo());
		System.out.println();
		
		conta.depositar(250.0);
		System.out.println("O saldo atual é de R$ " + conta.getSaldo());
		System.out.println();
		
		conta.sacar(150.0);
		System.out.println("O saldo atual é de R$ " + conta.getSaldo());
		System.out.println();
		
		ContaPoupanca conta2 = new ContaPoupanca("0001", "7543", 6, 200.0);
		
		conta2.transferir(100.0, conta);
		System.out.println("O saldo conta destino é de R$ " + conta2.getSaldo());
		System.out.println();
		
		System.out.println("O saldo atual é de R$ " + conta.getSaldo());
		System.out.println();
	}

}
