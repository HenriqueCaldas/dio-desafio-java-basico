package aplicacao.banco;

/**
 * Classe principal da aplicacao que inicia o sistema
 */
public class ContaBancoAplication {
	public static void main(String[] args) {
		
		//Cria uma contaTeminal para poder chamar o metodo iniciar
		ContaTerminal contaTerminal = new ContaTerminal();
		
		contaTerminal.iniciar();//Chama o metodo iniciar
		
	}
}
