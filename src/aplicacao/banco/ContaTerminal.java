package aplicacao.banco;

import java.util.Scanner;

/*
 * Classe responsavel pela interacao com o cliente do banco
 */
public class ContaTerminal {

	static Scanner scanner;

	/*
	 * Cria uma nova instancia de ContaTerminal e inicializa o Scanner
	 */
	public ContaTerminal() {
		scanner = new Scanner(System.in);
	}

	/*
	 * Metodo que inicializa o sistema bancario
	 */
	public void iniciar() {
		// Ler dados do cliente
		String nome = lerString("Digite seu nome:");
		String agencia = lerString("Digite sua agência:");
		int numeroConta = lerInt("Digite o número da sua conta:");

		// Cria cliente e contaBancaria
		Cliente cliente = new Cliente(nome, agencia);
		ContaBancaria contaBancaria = new ContaBancaria(numeroConta, 1200);

		// Mostra a mensagem informativa ao cliente
		mensagemInformativa(cliente, contaBancaria);

		// Fecha o Scanner
		fecharScanner();

	}

	/*
	 * Ler os dados de String do terminal
	 * 
	 * @param pergunta recebe a pergunta a ser exibida ao cliente
	 * 
	 * @return retorna o dado respondido pelo usuário no terminal
	 */
	public static String lerString(String pergunta) {
		System.out.println(pergunta);
		return scanner.nextLine();
	}

	/*
	 * Ler os dados de numeros inteiros do terminal
	 * 
	 * @param pergunta recebe a pergunta a ser exibida ao cliente
	 * 
	 * @return retorna o dado respondido pelo usuário no terminal
	 */
	public static int lerInt(String pergunta) {
		System.out.println(pergunta);
		return scanner.nextInt();
	}

	/*
	 * Informa a mensagem final com os dados do cliente
	 * 
	 * @param cliente recebe o cliente
	 * 
	 * @param contaBancaria recebe uma conta bancaria
	 */
	public static void mensagemInformativa(Cliente cliente, ContaBancaria contaBancaria) {
		System.out.println("Olá! " + cliente.getNome() + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ cliente.getAgencia() + ", conta " + contaBancaria.getNumeroConta() + " e seu saldo "
				+ contaBancaria.getSaldo() + " já está disponível para saque.");
	}

	/*
	 * Fecha o Scanner
	 */
	public static void fecharScanner() {
		scanner.close();
	}
}
