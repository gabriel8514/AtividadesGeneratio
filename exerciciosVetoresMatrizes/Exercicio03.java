/* Exercicio 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
Autor: Gabriel Reis 
Data: 06/07/2021
 */

package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		int n1[][] = new int[2][3];
		int n2[][] = new int[2][3];
		int m1[][] = new int[2][3];
		int m2[][] = new int[2][3];

		Scanner ler = new Scanner(System.in);

		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print("Entre com a matriz N1 Posição " + l + c + " : ");
				n1[l][c] = ler.nextInt();
				System.out.print("Entre com a matriz N2 Posição " + l + c + " : ");
				n2[l][c] = ler.nextInt();

				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}
			System.out.println("");
		}
		System.out.println("\nMatriz N1");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(n1[l][c] + "\t");
			}
			System.out.println("");
		}

		System.out.println("\nMatriz N2");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(n2[l][c] + "\t");
			}
			System.out.println("");
		}

		System.out.println("\nMatriz M1");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(m1[l][c] + "\t");
			}
			System.out.println("");
		}

		System.out.println("\nMatriz M2");
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(m2[l][c] + " \t");
			}
			System.out.println("");
		}
		ler.close(); 
	}
}
