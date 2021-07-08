package exercicio2POO;

public class Aviao {

	// Atributos 
	String Companhia; 
	String modelo; 
	int capacidadePassageiros; 
	double capacidadeCombustivel; 
	int vagasLivres; 
	
	// metodos 
	
	void vagasOcupadas (int passageiros) {
		vagasLivres = capacidadePassageiros - passageiros; 
	}
}
