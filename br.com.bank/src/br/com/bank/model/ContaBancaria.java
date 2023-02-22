package br.com.bank.model;

import java.util.InputMismatchException;

import br.com.bank.var;

public class ContaBancaria {
	private String agencia;
	private String conta;
	private Integer digito;
	private Double saldo;
	private Double VALOR_MINIMO_DEPOSITO = 10.0;

	public ContaBancaria(String agencia, String conta, Integer digito, Double saldoInicial) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.digito = digito;
		this.saldo = saldoInicial;
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

	public void depositar(Double valor) {
		if (valor < VALOR_MINIMO_DEPOSITO) {
			throw new InputMismatchException("O valor mínimo de depósito é R$ " + VALOR_MINIMO_DEPOSITO);
		}
		this.saldo += valor;
	}

	public Double sacar(Double valor) {
		if (valor > this.saldo) {
			throw new InputMismatchException("O saldo é insuficiente");
		}
		this.saldo -= valor;

		return valor;
	}

}