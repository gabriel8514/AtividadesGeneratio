/* Exercicio 4 Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
	calcule a seguinte expressão: (consultar material)
	* Autor: Gabriel Reis 
	* Data: 01/07/2021
*/

package generationAtividadeExerciciosPortugol;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		double A, B, C, R, S, DResult; 
		
		Scanner ler = new Scanner (System.in); 
		
		System.out.println("Valor de A, esse valor precisa ser inteiro e positivo: ");
		A = ler.nextDouble(); 

		System.out.println("Valor de B, esse valor precisa ser inteiro e positivo: ");
		B = ler.nextDouble(); 
		
		System.out.println("Valor de C, esse valor precisa ser inteiro e positivo: ");
		C = ler.nextDouble(); 

		R = ((A+B) * (A+B));
		S = ((B+C) * (B+C));
		DResult = (R+S)/2;

		System.out.println("O resultado da expressão é: " + DResult);  
		
	}
}
