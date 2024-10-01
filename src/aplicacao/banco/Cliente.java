package aplicacao.banco;

public class Cliente {
	
	private String nome;
	private String agencia;
	
	public Cliente(String nome, String agencia) {
		super();
		this.nome = nome;
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	
	
	
	
	
}
