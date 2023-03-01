package br.com.bank.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

//utiliza o abstract para que não possa ser estanciada, pois funciona como um modelo para a conta poupança ou para a conta corrente
public abstract class ContaBancaria {
	protected String agencia;
	protected String conta;
	protected Integer digito;
	protected Double saldo;
	protected Date dataAbertura;
	protected ArrayList<Movimentacao> movimentacoes; //sem get e set
	protected Double VALOR_MINIMO_DEPOSITO = 10.0;

	public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
		this.agencia = agencia;
		this.conta = conta;
		this.digito = digito;
		this.saldo = saldoInicial;
		this.dataAbertura = new Date();
		//sempre estanciar para utilizar, e isso garante que será estanciado
		this.movimentacoes = new ArrayList<Movimentacao>();//se não fizer isso dá nullpoint excewption
		//criando a primeira movimentacao
		Movimentacao movimentacao = new Movimentacao("Abertura de conta", saldoInicial);
		// iniciando o extrato
		this.movimentacoes.add(movimentacao); //aqui estou salvando a movimentacao no array de movimentacao
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public Integer getDigito() {
		return digito;
	}

	public void setDigito(Integer digito) {
		this.digito = digito;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}
	
	public void depositar(Double valor) {
		if (valor < VALOR_MINIMO_DEPOSITO) {
			throw new InputMismatchException("O valor mínimo de depósito é R$ " + VALOR_MINIMO_DEPOSITO);
		}
		this.saldo += valor;
		
		Movimentacao movimentacao = new Movimentacao("Deposito", valor);
		this.movimentacoes.add(movimentacao);
	}

	public Double sacar(Double valor) {
		if (valor > this.saldo) {
			throw new InputMismatchException("O saldo é insuficiente");
		}
		this.saldo -= valor;
		
		Movimentacao movimentacao = new Movimentacao("Retirada de valor", valor);
		this.movimentacoes.add(movimentacao);

		return valor;
	}

	public void transferir(Double valor, ContaBancaria contaDestino) {
		// Efetua um saque na conta atual
		this.sacar(valor);
		// Efetua o deposito na conta de destino
		contaDestino.depositar(valor);
	}

	public abstract void imprimirExtrato(); // metodo abstrado não pode implementar, quem herdar que vai ter que implementar, criar
	
}
