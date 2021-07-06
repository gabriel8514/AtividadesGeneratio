/* Exercicio 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
Autor: Gabriel Reis 
Data: 06/07/2021
 */


package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] valores = new double[5];
		double maior = 0; 
		
		System.out.println("Digite 5 valores abaixo: ");
		for (int l = 0; l < valores.length; l++) {
			valores[l] = entrada.nextDouble();
			if (valores[l] > maior) {
				maior = valores[l];  
			}
		}
		System.out.println("A maior pontuação é: " + maior);
		entrada.close(); 
	}
}
