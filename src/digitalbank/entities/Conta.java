package digitalbank.entities;

import digitalbank.exceptions.SaldoInsuficienteException;
import digitalbank.interfaces.ContaMetodo;

public abstract class Conta implements ContaMetodo{
	private static int SEQUENCIAL = 1;
	
	private int numero;
	private double saldo;
	
	private Agencia agencia;
	private Cliente cliente;
	
	public Conta() {
		this.numero = SEQUENCIAL++;
	}
	
	public Conta(Agencia agencia, Cliente cliente) {
		this.numero = SEQUENCIAL++;
		this.agencia = agencia;
		this.cliente = cliente;
	}

	@Override
	public void transferir(double valor, Conta conta) {
		sacar(valor);
		conta.depositar(valor);
	}
	@Override
	public void sacar(double valor) {
		if (saldo > 0 && saldo >= valor && valor > 0) {
			saldo -= valor;
		} else {
			throw new SaldoInsuficienteException("Saldo insuficiente");
		}
	}
	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
		}
		else { 
			throw new SaldoInsuficienteException("Deposito inválido: valor deve ser positivo");
		}
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Cliente:  %s", cliente.getNome()));
		System.out.println(String.format("Agencia:  %d", agencia));
		System.out.println(String.format("Numero:  %d", numero));
		System.out.println(String.format("Saldo:  %.2f", saldo));
	}
	
	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", agencia=" + agencia + ", cliente=" + cliente + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	
	
}
