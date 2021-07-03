package generationAtividadeExerciciosPortugol;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		double custoCarro, custoConsumidor, porcentagemDistribuidor, impostos;

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Custo do carro: ");
		custoCarro = ler.nextDouble();
		
		porcentagemDistribuidor = (custoCarro / 100) * 28;
		impostos = (custoCarro / 100) * 45;

		custoConsumidor = custoCarro + porcentagemDistribuidor + impostos;

		System.out.println("Custo consumidor: " + custoConsumidor + " Porcentagem distribuidor: " + porcentagemDistribuidor + " Impostos: " + impostos);			

	}
}
