package exercicioGeneration;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero, resto, raiz, quadrado;
		
		System.out.print("Digite um numero: ");
		numero = ler.nextDouble();
		
		resto = numero % 2;
		
		if(resto == 0) {
			System.out.println("O numero digitado � PAR" );
			raiz = Math.sqrt(numero);
			System.out.println("A Raiz quadrada �: " + raiz);
		} else {
			System.out.println("O numero digitado � IMPAR" );
			quadrado = Math.pow(numero, 2.0);
			System.out.println("A Raiz quadrada �: " + quadrado); 
		}
		ler.close(); 
	}
}
