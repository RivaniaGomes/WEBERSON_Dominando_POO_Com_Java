package br.com.bank;

import br.com.bank.model.ContaCorrente;
import br.com.bank.model.ContaPoupanca;
import br.com.bank.model.Movimentacao;
import br.com.bank.utils.DataUtil;

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
		
		//quando o metodo é static posso chamar ele sem estanciar um objeto, geralmente usado nos metodos de conversao
		var formatado1 = DataUtil.converterDateParaDataEHora(conta2.getDataAbertura());
		var formatado2 = DataUtil.converterDateParaData(conta2.getDataAbertura());
		var formatado3 = DataUtil.converterDateParaHora(conta2.getDataAbertura());
		System.out.println(formatado1);
		System.out.println(formatado2);
		System.out.println(formatado3);
		
		//Extrato bancario
		Movimentacao movimentacao = new Movimentacao("Saque", 100.0);
		
		System.out.println(movimentacao);
		
		movimentacao.toString();
	}

}
