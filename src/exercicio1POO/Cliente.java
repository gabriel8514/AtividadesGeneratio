package exercicio1POO;

public class Cliente {
	
	// Atributos 
	String nome; 
	String sobrenome;
	String endereço;
	int anoNasc;
	int credito = 2000;  
	int saldoRestante; 

	// Métodos
	void valorCompra (int compra) {
		saldoRestante = credito - compra; 
	}
}
