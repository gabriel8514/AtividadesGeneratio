/* Exercicio Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
Autor: Gabriel Reis 
Data: 06/07/2021
 */

package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int valor[][] = new int[3][3];
		int somaTotal = 0, somaDiagonal = 0;

		System.out.println("Digite os numeros da matriz");
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				valor[l][c] = ler.nextInt();
				somaTotal = somaTotal + valor[l][c];
				if (l == c) {
					somaDiagonal = somaDiagonal + valor[l][c];
				}
			}
		}
		// conseguir incluir tudo no bloco inicial. 
		/*
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				if (l == c) {
					somaDiagonal = somaDiagonal + valor[l][c];
				}
			}
		}
		*/
		// comando abaixo para imprir a tabela
		System.out.println("");
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(valor[l][c] + " ");
			}
			System.out.println("");
		}
		System.out.println("\nA soma dos valores é: " + somaTotal);
		System.out.println("A soma dos valores da Diagonal é: " + somaDiagonal);
		ler.close();
	}
}
