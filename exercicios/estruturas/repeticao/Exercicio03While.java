/* 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
Autor: Gabriel Reis
Data: 05/07/2021
 */

package exercicios.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio03While {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 0, menor21 = 0 , maior50 = 0; 
		
		while (idade != -99) {
			System.out.print("Digite uma idade: ");
			idade = ler.nextInt();
			
			if (idade < 21 && idade != -99) {
				menor21++;
			}
			if (idade > 50) {
				maior50++;
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos é: " + menor21);
		System.out.println("Total de pessoas com mais de 50 anos é: " + maior50);
		ler.close(); 
	}
}
