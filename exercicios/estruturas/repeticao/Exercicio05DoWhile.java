/* 5- Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
Autor: Gabriel Reis
Data: 05/07/2021
 */

package exercicios.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio05DoWhile {

	public static void main(String[] args) {
		
		int numero, soma = 0; 
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero: ");
			numero = ler.nextInt();
			soma = soma + numero; 
		}
		while (numero != 0); 
		System.out.println("A soma dos valores digitados �: " + soma);
		ler.close(); 
	}
}
