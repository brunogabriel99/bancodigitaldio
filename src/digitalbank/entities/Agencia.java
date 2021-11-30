package digitalbank.entities;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	private List<Conta> contas = new ArrayList<>();
	
	public Agencia() {
	}

	public Agencia(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Conta> getContas() {
		return contas;
	}

	@Override
	public String toString() {
		return "Agencia [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}
	
	
}
