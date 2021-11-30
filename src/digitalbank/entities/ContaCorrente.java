package digitalbank.entities;

public class ContaCorrente extends Conta{

	public ContaCorrente() {
	}
	
	public ContaCorrente(Agencia agencia, Cliente cliente) {
		super(agencia, cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente === ");
		imprimirInfosComuns();
	}

	
}
