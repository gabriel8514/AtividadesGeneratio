/* Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
Autor: Gabriel Reis
Data: 05/07/2021
 */

package exercicios.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio06DoWhile {

	public static void main(String[] args) {
		
		int numero, media = 0, soma = 0, cont = -1;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero: ");
			numero = ler.nextInt(); 
			
			if (numero % 3 == 0) {
				soma = soma + numero;
				cont++;
			}
		}
		while (numero != 0); 
		media = soma / cont; 
		System.out.println(cont);
		System.out.println(media); 
		System.out.println("A media dos numeros multiplos de 3 é: " + media);
		ler.close(); 
	}
}
