package aplicacao.banco;

import java.util.Scanner;

public class ContaTerminal {
	
	static Scanner scanner;
	
	public ContaTerminal() {
		scanner = new Scanner(System.in);
	}
	
	public static String lerString(String pergunta) {
		System.out.println(pergunta);
			return scanner.nextLine();
	}
	
	public static int lerInt(String pergunta) {
		System.out.println(pergunta);
		return scanner.nextInt();
	}
	
	public static void fecharScanner() {
		scanner.close();
	}
	
	public void iniciar() {
		String nome = lerString("Digite seu nome:");	
		String agencia = lerString("Digite sua agência:");	
		int numeroConta = lerInt("Digite o número da sua conta:");	
		
		Cliente cliente = new Cliente(nome, agencia);
		ContaBancaria contaBancaria = new ContaBancaria(numeroConta, 1200);
		
		System.out.println("Olá! " + cliente.getNome() + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
				cliente.getAgencia() + ", conta " + contaBancaria.getNumeroConta() + " e seu saldo " + contaBancaria.getSaldo() + 
					" já está disponível para saque.");
		
		fecharScanner();
		
	}
}
