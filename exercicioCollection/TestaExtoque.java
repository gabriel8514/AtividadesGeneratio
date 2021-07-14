package exercicioCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaExtoque {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Estoque> estoque = new ArrayList<>();

		System.out.print("Quantos itens você deseja acrescentar no estoque: ");
		int numeroEstoque = sc.nextInt();

		for (int i = 0; i < numeroEstoque; i++) {
			System.out.print("Descrição do Item: ");
			String descricao = sc.next();

			System.out.print("SKU do Item:");
			String sku = sc.next();

			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();

			System.out.print("Valor unidatario: ");
			double valorUni = sc.nextDouble();

			estoque.add(new Estoque(sku, descricao, quantidade, valorUni));
		}
		System.out.println("");
		for (int c= 0; c < estoque.size(); c++) {
			System.out.print("Linha - " + c);
			System.out.println(estoque.get(c));
		}
		System.out.println("Deseja excluir algum item? (S/N)"); 
		String remover = sc.next(); 

		if (remover != "N") {
			System.out.print("Digite o numero da minha que deseja remover: ");
			int remov = sc.nextInt(); 
			estoque.remove(remov);
			System.out.println("Linha excluida!!!");
			System.out.println("Estoque Atualizado");
			for (Estoque i : estoque) {
				System.out.println(i);
			}
		} else {
			System.out.println("Programa encerrado"); 
		}
		sc.close();
	}

}
