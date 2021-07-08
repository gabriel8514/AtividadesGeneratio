package exercicio2POO;

public class TestaAviao {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		
		// Atribuir 
		aviao1.capacidadeCombustivel = 2000.65;
		aviao1.capacidadePassageiros = 200;
		aviao1.Companhia = "Azul"; 
		aviao1.modelo = "Boing 77";
		
		// add metodo 
		aviao1.vagasOcupadas(50);
		
		//imprimir 
		System.out.println("Companhia = " + aviao1.Companhia);
		System.out.println("Modelo = " + aviao1.modelo);
		System.out.println("Capacidade combustivel = " + aviao1.capacidadeCombustivel);
		System.out.println("Capacidade depassageiros = " + aviao1.capacidadePassageiros);
		System.out.println("Vagas livre = " +aviao1.vagasLivres);
		
	}
}
