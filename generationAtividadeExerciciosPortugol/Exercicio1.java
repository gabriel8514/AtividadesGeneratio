/* Exercicio 1 Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
 * Autor: Gabriel Reis 
 * Data: 01/07/2021 
*/

package generationAtividadeExerciciosPortugol;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int dia, mes, ano, resultado;

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem? ");
		ano = ler.nextInt();
		
		System.out.println("Quantos meses? ");
		mes = ler.nextInt(); 

		System.out.println("Quantos dias? ");
		dia = ler.nextInt(); 
		
		resultado = (ano * 365) + (mes * 30) + dia; 

		System.out.println("Sua idade em dias é: " + resultado); 
	}
}
