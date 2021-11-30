package application;

import digitalbank.entities.Agencia;
import digitalbank.entities.Cliente;
import digitalbank.entities.Conta;
import digitalbank.entities.ContaCorrente;
import digitalbank.entities.ContaPoupanca;
import digitalbank.exceptions.ContaException;

public class Program {

	public static void main(String[] args) {
		try {
		Cliente cliente = new Cliente("Bruno", "111111", "8181818181");
		Agencia agencia = new Agencia("Verde Mar", "Rua dois de abril", "32343234");
		Conta conta = new ContaCorrente(); 
		conta.setAgencia(agencia);
		conta.setCliente(cliente);
		conta.depositar(100);
		Conta contaPoupanca = new ContaPoupanca();
		contaPoupanca.setAgencia(agencia);
		conta.transferir(100, contaPoupanca);
		contaPoupanca.sacar(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
