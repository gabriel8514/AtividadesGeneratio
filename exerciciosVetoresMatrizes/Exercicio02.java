/* Exercicio 2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o.
Autor: Gabriel Reis 
Data: 06/07/2021
 */

package exerciciosVetoresMatrizes;

public class Exercicio02 {

	public static void main(String[] args) {
		
		double lan�amentos[] = new double[10];
		double soma = 0, maior = 0;
		
		// int lan�amentos; lan�amentos = {1,2,3,4,5,6,1,2,3,6} 
		lan�amentos[0] = 1; 
		lan�amentos[1] = 2; 
		lan�amentos[2] = 3; 
		lan�amentos[3] = 4; 
		lan�amentos[4] = 5; 
		lan�amentos[5] = 6; 
		lan�amentos[6] = 1; 
		lan�amentos[7] = 2; 
		lan�amentos[8] = 3; 
		lan�amentos[9] = 6;
		
		for (int l = 0; l < 10; l++) {
			soma = soma + lan�amentos[l];
			if(lan�amentos[l] == 6) {
				maior++;
			}
		}
		System.out.println("A media � de: " + (soma/10));
		System.out.println("A quantidade de vezes que houve a maior pontua��o foi de: " + maior);
	}
}
