/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
Autor: Gabriel Reis
Data: 05/07/2021
 */
package exercicios.estruturas.repeticao;

import java.util.Scanner;

public class Exercicio02For {

	public static void main(String[] args) {

		double numero, par = 0, impar = 0, resto;

		Scanner ler = new Scanner(System.in);

		System.out.println("Escreva 10 numeros: ");

		for (int cont = 1; cont <= 10; cont++) {
			numero = ler.nextDouble();
			resto = numero % 2;
			if (resto == 0) {
				par++; 
			}else {
				impar++;
			}
		}
		System.out.println("Impar = " + impar);
		System.out.println("Par = " + par);
		ler.close();  
	}
}
