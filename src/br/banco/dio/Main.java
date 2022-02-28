package br.banco.dio;

public class Main {
	public static void main(String[] args) {
		Cliente alexandre = new Cliente();
		alexandre.setNome("Alexandre Souza");
		
		Conta cc = new ContaCorrente(alexandre);
		cc.deposito(100);
		
		Conta poupanca = new ContaPoupanca(alexandre);
		cc.transferencia(50, poupanca);
		poupanca.deposito(300);
		
		
		cc.imprimirInfoComuns();
		poupanca.imprirExtrato();
	}
	
}
