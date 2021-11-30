package digitalbank.entities;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca() {
	}
	
	public ContaPoupanca(Agencia agencia, Cliente cliente) {
		super(agencia, cliente);
	}
	
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança === ");
		imprimirInfosComuns();
	}
	
	
}
