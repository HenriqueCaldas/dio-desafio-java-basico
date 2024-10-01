package aplicacao.banco;

/**
 * Representa um cliente de um banco.
 */
public class Cliente {
	
	private String nome;
	private String agencia;
	
    /**
     * Cria um novo cliente com o nome e a agencia especificados.
     *
     * @param nome O nome do cliente.
     * @param agencia A agência do cliente.
     */
	public Cliente(String nome, String agencia) {
		super();
		this.nome = nome;
		this.agencia = agencia;
	}

    /**
     * Retorna o nome do cliente.
     *
     * @return O nome do cliente.
     */
	public String getNome() {
		return nome;
	}

    /**
     * Retorna a agência do cliente.
     *
     * @return A agência do cliente.
     */
	public String getAgencia() {
		return agencia;
	}
	
}
