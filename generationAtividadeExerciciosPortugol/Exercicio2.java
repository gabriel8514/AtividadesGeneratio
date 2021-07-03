/* Exercicio 2 Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	expressa em anos, meses e dias.
	* Autor: Gabriel Reis 
	* Data: 01/07/2021
*/

package generationAtividadeExerciciosPortugol;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int idadeEmDias, anos, meses, dias; 
		
		Scanner ler = new Scanner (System.in); 
		
		System.out.println("Escreva sua idade em dias: ");
		idadeEmDias = ler.nextInt(); 

		anos = idadeEmDias / 365;
		meses = (idadeEmDias%365)/30;
		dias = idadeEmDias%365%30; 

		System.out.println("A idade da pessoa é de " + anos + " anos " + meses + " meses " + dias + " dias."); 
	}

}
