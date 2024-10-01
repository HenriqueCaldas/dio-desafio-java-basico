package aplicacao.banco;

/**
 * Representa uma conta bancária de um cliente.
 */
public class ContaBancaria {

	private int numeroConta; // Numero da conta
	private double saldo; // Saldo da conta

	/*
	 * Cria uma nova ContaBancaria com o numero da conta e saldo
	 * 
	 * @param numeroConta O numero da Conta
	 * 
	 * @param saldo O saldo da Conta
	 */
	public ContaBancaria(int numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	/**
	 * Retorna o número da conta.
	 *
	 * @return O número da conta.
	 */
	public int getNumeroConta() {
		return numeroConta;
	}

	/**
	 * Retorna o saldo da conta.
	 *
	 * @return O saldo da conta.
	 */
	public double getSaldo() {
		return saldo;
	}

}
