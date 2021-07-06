/* Exercicio 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
Autor: Gabriel Reis 
Data: 06/07/2021
 */

package exerciciosVetoresMatrizes;

public class Exercicio02 {

	public static void main(String[] args) {
		
		double lançamentos[] = new double[10];
		double soma = 0, maior = 0;
		
		// int lançamentos; lançamentos = {1,2,3,4,5,6,1,2,3,6} 
		lançamentos[0] = 1; 
		lançamentos[1] = 2; 
		lançamentos[2] = 3; 
		lançamentos[3] = 4; 
		lançamentos[4] = 5; 
		lançamentos[5] = 6; 
		lançamentos[6] = 1; 
		lançamentos[7] = 2; 
		lançamentos[8] = 3; 
		lançamentos[9] = 6;
		
		for (int l = 0; l < 10; l++) {
			soma = soma + lançamentos[l];
			if(lançamentos[l] == 6) {
				maior++;
			}
		}
		System.out.println("A media é de: " + (soma/10));
		System.out.println("A quantidade de vezes que houve a maior pontuação foi de: " + maior);
	}
}
