package exercicio1POO;

public class Cliente {
	
	// Atributos 
	String nome; 
	String sobrenome;
	String endere�o;
	int anoNasc;
	int credito = 2000;  
	int saldoRestante; 

	// M�todos
	void valorCompra (int compra) {
		saldoRestante = credito - compra; 
	}
}
