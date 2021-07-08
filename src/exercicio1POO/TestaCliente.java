package exercicio1POO;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente cliente = new Cliente(); // Criei o objeto.

		// Adicionei atributos 
		cliente.nome = "Gabriel";
		cliente.sobrenome = "Reis";
		cliente.anoNasc = 1997;
		cliente.credito = 2000;

		// Utilizei o metodo 
		cliente.valorCompra(500);

		System.out.println("==== Dados Do Cliente ====");
		System.out.println("Nome: " + cliente.nome);
		System.out.println("Sobre nome: " + cliente.sobrenome);
		System.out.println("Ano de Nascimento: " + cliente.anoNasc);
		System.out.println("Credito: " + cliente.credito);
		// System.out.println("Valor gasto: " + cliente.valorCompra(500) );
		System.out.println("Credito restante: " + cliente.saldoRestante);
	}
}
