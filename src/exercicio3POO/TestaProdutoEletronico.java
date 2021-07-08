package exercicio3POO;

public class TestaProdutoEletronico {

public static void main(String[] args) {
		
		ProdutoEletronico produto = new ProdutoEletronico(); 
		
		// Atribuir 
		produto.Tipo = "Celular"; 
		produto.marca = "LG"; 
		produto.modelo = "LG K10";
		produto.quantidadeEntrada = 100;
		produto.valor = 1800;
		
		// add metodo 
		produto.saidas(80);
		
		//imprimir 
		System.out.println("Tipo = " + produto.Tipo);
		System.out.println("Marca = " + produto.marca);
		System.out.println("Modelo = " + produto.modelo);
		System.out.println("Quantidade Entrada = " + produto.quantidadeEntrada);
		System.out.println("Valor = " + produto.valor);
		System.out.println("Saldo disponivel = " + produto.saldoDisponivel); 
		
	}
}
