package br.banco.dio;

public interface IConta {
	
	void sacar(double valor);
	
	void deposito(double valor);
	
	void transferencia(double valor, Conta contaDestino);
	
	void imprirExtrato();

}
