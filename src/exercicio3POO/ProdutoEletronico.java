package exercicio3POO;

public class ProdutoEletronico {

	// Atributos 
		String Tipo; 
		String marca; 
		String modelo;
		int quantidadeEntrada;  
		double valor; 
		int saldoDisponivel;  
		
		// metodos 
		
		void saidas (int saida) {
			saldoDisponivel = quantidadeEntrada - saida;  
		}
	}
