package digitalbank.interfaces;

import digitalbank.entities.Conta;

public interface ContaMetodo {

	void transferir(double valor, Conta conta);
	void sacar(double valor);
	void depositar(double valor);
	void imprimirExtrato();
}
