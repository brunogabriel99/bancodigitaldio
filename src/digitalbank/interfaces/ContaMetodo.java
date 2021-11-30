package digitalbank.interfaces;

import digitalbank.entities.Conta;
import digitalbank.exceptions.ContaException;

public interface ContaMetodo {

	void transferir(double valor, Conta conta) throws ContaException;
	void sacar(double valor);
	void depositar(double valor);
	void imprimirExtrato();
}
